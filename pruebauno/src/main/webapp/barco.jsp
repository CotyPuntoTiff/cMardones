<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Barco</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    <c:if test="${msgError!= null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/barco/guardar" method="post" modelAttribute="auto">
                        <form:label path="nombre" class="form-label">Nombre: </form:label>
                        <form:input path="nombre" class="form-control" />
                        <br>
                        <form:label path="color" class="form-label">Color: </form:label>
                        <form:input path="color" class="form-control" />
                        <br>
                        <form:label path="tipo" class="form-label">Tipo: </form:label>
                        <form:input path="tipo" class="form-control" />
                        <br>
                        <button type="submit" class="btn btn-outline-primary">Guardar Auto</button>
                    </form:form>
                </div>
            </body>

            </html>