<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 목록</title>
</head>
<body>
    <h1>사용자 목록 조회</h1>
    
    <c:if test="${not empty param.searchId}" >
    <h3>"${param.searchId}" 검색 결과</h3>
    </c:if>

    <form ac
    tion="/search">

         ID 검색 : <input type="text" name="searchId" 
                    placeholder="포함되는 아이디 검색"
                    va;ie="${param.searchId}"> 
                   <button>검색</button> 
    </form>

    <hr>

    <table border="1">
        <thead>
            <tr>
                <th>회원번호</th>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <%--<th>등록일</th>--%>
            </tr>
        </thead>
        <tbody>
            <%-- 조회 결과가 없을 경우 --%>
            <c:if test="${empty userList}" >
                <tr>
                         <th colspan="5">조회 결과가 없습니다</th>
                </tr>
            </c:if>
            <%-- 조회 결과가 있을 경우 --%>
            <c:if test = "${not empty userList}">
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <th><c:out value="${user.userNo}"/></th>
                        <td>
                          <a href="/selectUser?userNo=${user.userNo}"><c:out value="${user.userId}"/></a>
                        </td>
                        <%--<td><c:out value="${user.userPw}"/></td>--%>
                        <td><c:out value="${user.userName}"/></td>
                        <%--<td><c:out value="${user.enrollDate}"/></td>--%>
                    </tr>
                </c:forEach>
        </c:if>
        </tbody>
    </table>
          <c:if test="${!empty sessionScope.message}" >
            <script>
                alert("${sessionScope.message}");
            </script>

           <%-- session에 존재하는 message 제거 --%>
    <c:remove var="message" scope="session" />
  </c:if>
</body>
</html>