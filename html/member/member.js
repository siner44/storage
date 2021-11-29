
// 회원 정보를 저장할 배열 생성
var members = [];

window.onload = function () {

    // 회원 리스트 갱신
    // 로컬 스토리지에 데이터가 존재하는지 확인 후 처리
    // getItem(key) 데이터 없으면 null 반환
    if (localStorage.getItem('members')) {
        // not null : 저장되어 있는 JSON 문자열을 자바스크립트의 배열로 변경
        members = JSON.parse(localStorage.getItem('members'));
    } else {
        //null -> 비어있는 배열을 저장
        localStorage.setItem('members', JSON.stringify(members));
    }

    console.log(members);

    setMemberList();

    // regForm 캐스팅 => onsubmit 이벤트 설정
    // 데이터 캐스팅 -> 객체 -> 배열에 저장

    // 폼태그 캐스팅
    var regForm = document.getElementById('regForm');

    var userId = document.querySelector('#userId');
    var pw = document.querySelector('#pw');
    var repw = document.querySelector('#repw');
    var userName = document.querySelector('#userName');

    // 이벤트 설정 : 입력
    regForm.onsubmit = function () {

        // alert('onsubmit');
        // 데이터 받아서 객체 생성


        // 사용자 입력 값의 유효성 검사
        // 아이디 검사: 공백, 문자열의 개수 6~12, 서버 통신(비동기통신) 아이디 중복 여부
        if (userId.value.trim().length == 0) {
            // msgId 캐스팅 => 문자열 추가
            document.querySelector('#msgId').innerHTML = '아이디는 필수항목입니다.';
            // 포커스 이동
            // userId.focus();
            // 문제가 발생했기 때문에 객체 생성을 하면 안됨.
            return false;
        } else if (!(userId.value.trim().length > 2 && userId.value.trim().length < 9)) {
            document.querySelector('#msgId').innerHTML = '아이디는 3~8자리입니다.';
            return false;
        }

        // 비밀번호 검사: 공백, 4~10
        if (pw.value.trim().length == 0) {
            document.querySelector('#msgPw').innerHTML = '비밀번호는 필수항목입니다.';
            return false;
        } else if (!(pw.value.trim().length >= 4 && pw.value.trim().length <= 10)) {
            document.querySelector('#msgPw').innerHTML = '비밀번호는 4~10자리입니다.';
            return false;
        }

        // 비밀번호 확인: 공백, 비밀번호와 일치 여부
        if (repw.value.trim().length == 0) {
            document.querySelector('#msgRePw').innerHTML = '비밀번호 확인은 필수입니다.';
            return false;
        } else if (repw.value != pw.value) {
            document.querySelector('#msgRePw').innerHTML = '비밀번호와 일치하지 않습니다.';
            return false;
        }

        // 이름 검사: 공백, 2자 이상
        if (userName.value.trim().length == 0) {
            document.querySelector('#msgName').innerHTML = '이름은 필수항목입니다.';
            return false;
        } else if (!(userName.value.trim().length >= 2)) {
            document.querySelector('#msgName').innerHTML = '이름은 2자 이상입니다.';
            return false;
        }


        // 객체 생성
        var member = new Member(userId.value, pw.value, userName.value);
        console.log('member', member);

        // 객체를 배열에 저장
        members.push(member);
        console.log('members', members);


        localStorage.setItem('members', JSON.stringify(members));

        // form 초기화
        // this: 이벤트가 발생한 객체 -> regForm
        this.reset();

        // 리스트를 갱신
        setMemberList();

        return false;
    };

    // 입력 폼에 focus가 들어가면 아래 메시지 삭제
    userId.addEventListener('focus', function () {
        document.querySelector('#msgId').innerHTML = '';
    });
    pw.addEventListener('focus', function () {
        document.querySelector('#msgPw').innerHTML = '';
    });
    repw.addEventListener('focus', function () {
        document.querySelector('#msgRePw').innerHTML = '';
    });
    userName.addEventListener('focus', function () {
        document.querySelector('#msgName').innerHTML = '';
    });

    //////////////////////////////////////////////////////
    // 수정 폼 이벤트 설정

    var editForm = document.querySelector('#editForm');
    var index = document.querySelector('#index');
    // var eid = document.querySelector('#eid');
    var epw = document.querySelector('#epw');
    var erepw = document.querySelector('#erepw');
    var ename = document.querySelector('#ename');
    var resetBtn = document.querySelector('#resetBtn');

    editForm.onsubmit = function () {

        // index 값 존재 유무 확인
        if (index.value, trim().length == 0) {
            alert('유효한 인덱스 값이 아닙니다.\n프로그램을 다시 시작하세요.');
            return false;
        }
        // pw 공백, 문자 사이즈
        if (epw.value.trim().length == 0) {
            alert("비밀번호는 필수항목입니다.");
            epw.focus();
            return false;
        } else if (!(epw.value.trim().length >= 4 && epw.value.trim().length <= 10)) {
            alert("비밀번호는 4~10자리 문자열만 가능합니다.");
            epw.focus();
            return false;
        }
        // erepw 공백, epw 일치 여부
        if (erepw.value.trim().length == 0) {
            alert('비밀번호 확인은 필수 항목입니다.');
            erepw.focus();
            return false;
        } else if (!(erepw.value == epw.value)) {
            alert('비밀번호가 일치하지 않습니다.')
            erepw.focus();
            return false;
        }
        // ename 공백, 문자열 사이즈
        if (ename.value.trim().length == 0) {
            alert("사용자의 이름은 필수 항목입니다.");
            ename.focus();
            return false;
        } else if (!(ename.value.trim().length < 2)) {
            alert('사용자의 이름은 2글자 이상 입력해야합니다.');
            ename.focus();
            return false;
        }

        // index 위치의 배열의 요소에 현재 캐스팅한 데이터를 입력
        members[index.value].pw = epw.value.trim();
        members[index.value].userName = ename.value.trim();

        // 저장
        localStorage.setItem('members', JSON.stringify(members));

        // 화면 갱신
        setMemberList();

        alert('수정되었습니다.');
        // 수정 폼 영역 비노출 처리
        editFormClose();

        return false;
    }

    resetBtn.onclick = function () {
        epw.value = members[index.value].pw;
        erepw.value = members[index.value].pw;
        // eid.value = members[index.value].userId;
        ename.value = members[index.value].userName;

    }

    // 이벤트 설정: 입력, 수정, 삭제

}

// 기능 함수들은 전역 형태로 정의

// 데이터 저장하는 객체 생성 -> 생성자 함수
function Member(userId, pw, userName) {
    this.userId = userId;
    this.pw = pw;
    this.userName = userName;
}

// JSON -> JS Object {}

// 회원 리스트 출력을 위한 기능
function setMemberList() {
    // 화면을 갱신할 HTML 생성
    var list = '';
    list += '<tr>';
    list += '  <th>순번(index)</th>';
    list += '  <th>아이디</th>';
    list += '  <th>비밀번호</th>';
    list += '  <th>이름</th>';
    list += '  <th>관리</th>';
    list += '</tr>';

    if (members.length==0) {
        list += '<tr><td colspan="5">회원의 정보가 존재하지 않습니다.</td></tr>';
    } else {

        for (let i=0; i<members.length; i++) {
            list += '<tr>';
            list += '  <td>' + i + '</td>';
            list += '  <td>' + members[i].userId + '</td>';
            list += '  <td>' + members[i].pw + '</td>';
            list += '  <td>' + members[i].userName + '</td>';
            list += '  <td><a href="javascript:editMemberForm('+ i +')">수정</a> | <a href="javascript:deleteMember('+i+')">삭제</a></td>';
            list += '</tr>';
        }
    }
    // tbody 캐스팅
    document.querySelector('#memberList>table>tbody').innerHTML=list;
}

// 수정 영역을 보이도록 처리하는 함수 : 클릭한 인덱스의 데이터가 폼에 입력
function editMemberForm(index) {
    // 수정 폼 영역이 노출되어야 한다.
    document.getElementById('editFormArea').style.display='block';
    var member = members[index];
    document.querySelector('#index').value=index;
    document.querySelector('#eid').value=member.userId;
    document.querySelector('#epw').value=member.pw;
    document.querySelector('#erepw').value=member.pw;
    document.querySelector('#ename').value=member.userName;
}

// 수정 영역을 닫는 함수
function editFormClose() {
    document.querySelector('#editFormArea').style.display='none';
}

// 배열의 데이터를 삭제하는 함수
function deleteMember(index) {
    // 배열의 요소를 삭제 : slice(index, count)

    if (confirm('정말 삭제하시겠습니까?')) {
        members.splice(index, 1);
        localStorage.setItem('members', JSON.stringify(members));
        alert('삭제되었습니다.');

        setMemberList();
    }

}