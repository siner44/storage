
-- 32. EQUI 조인을 사용하여 SCOTT 사원의 부서 번호와 부서 이름 출력
select ename, emp.deptno, dname
from emp, dept
where emp.deptno = dept.deptno and ename = 'SCOTT';

-- 33. INNER JOIN과 ON 연산자를 이용하여 사원 이름과 함께 
--     그 사원이 소속된 부서 이름과 지역명을 출력
select ename, dname, loc
from emp inner join dept
on emp.deptno = dept.deptno;

-- 36. 조인과 WildCARD를 사용하여 이름에 'A'가 포함된 모든 사원의 이름과 부서명을 출력
select ename, dname
from emp,dept
where emp.deptno = dept.deptno and ename like '%A%';

-- 37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서 번호 및 부서명을 출력
select ename, job, e.deptno, dname
from emp e, dept d
where e.deptno = d.deptno and loc = 'NEW YORK';

-- 38. SELF JOIN을 사용하여 사원의 이름 및 사원 번호, 관리자 이름을 출력
select e.ename, e.empno, m.ename
from emp e, emp m
where e.mgr = m.empno;

-- 39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원 번호를 기준으로 내림차순 정렬하여 출력
select e.ename, e.empno, nvl(m.ename, '관리자 없음')
from emp e, emp m
where e.mgr = m.empno(+)
order by e.empno desc;

-- 40. SELP JOIN을 사용하여 지정한 사원의 이름, 부서 번호, 지정한 사원과 동일한 부서에서 근무하는 사원 출력
select e.ename, e.deptno, m.ename
from emp e, emp m
where e.deptno = m.deptno and e.ename != m.ename and e.ename = 'SCOTT';

-- 41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력
select e.ename, e.hiredate
from emp e, emp m
where e.hiredate > m.hiredate and m.ename = 'WARD';

-- 42. SELF JOIN을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력
select e.ename, e.hiredate, m.ename, m.hiredate
from emp e, emp m
where e.hiredate < m.hiredate and e.mgr = m.empno;