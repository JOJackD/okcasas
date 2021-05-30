<%-- 
    Document   : seguimiento
    Created on : 29-05-2021, 1:46:34
    Author     : jorge
--%>

<%@page import="controlador.historialDao"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Historial"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historial</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body background="../assets/img/OKCasa.png">
               <!--NAV-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="../index.jsp">OKCasa</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-0 mb-lg-0 ">
                    <!-- ESPACIO EN EL NAV-->
                </ul>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                  <li class="nav-item mr-5 ">
                      <a class="nav-link active" href="./historial.jsp">Historial de inspecciones</a>
                  </li>
                  <li class="nav-item mr-5 ">
                      <a class="nav-link" href="./seguimiento.jsp">Ver seguimiento</a>
                  </li>
                  <li class="nav-item mr-5 ">
                      <a class="nav-link" href="./disponibilidad.jsp">Disponibilidad de equipo</a>
                  </li>
                </ul>
                <ul class="navbar-nav">
                    <a class="dropdown" href="#" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                        <h5 class="btn btn-primary">Usuario: <% out.print(session.getAttribute("usuario")); %></h5>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-lg-end" aria-labelledby="dropdownMenuLink"
                        <li><a class="dropdown-item" href="../vlogin.html">Cerrar sesión</a></li>
                    </ul>
                </ul>
              </div>
            </div>
        </nav>
        <!--CONTAINER-->
        <section class="py-5">
               <div class="row"><!--Row es para crear una fila-->
                <div class="col-lg-3"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <br>
                    <br>
                </div>
                <div class="col-lg-6"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <br>
                    <br>
                </div>
                <div class="col-lg-3"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <br>
                    <br>
                </div>  
            </div>
            <div class="row"><!--Row es para crear una fila-->
                <div class="col-lg-3"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <br>
                </div>
                <div class="col-lg-6"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <div>
                        <h1 class="display-2 text-light font-weight-bold">Historial</h1>
                    </div>
                    <div class="d-flex justify-content-center">
                        <div class="card" style='width: 800px'>
                            <div class="card-header">
                              <h4>Inspecciones</h4>
                            </div>
                            <div class="card-body">
                                <table class="table">
                                    <thead class='thead-dark'>
                                      <tr>
                                        <th scope="col">N° Inspecci&oacute;n</th>
                                        <th scope="col">Direccion</th>
                                        <th scope="col">Nro.Vivienda</th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <% 
                                        historialDao dao = new historialDao();
                                        List<Historial> lista_historial = dao.obtener_historial();
                                       
                                        for (int i = 0; i < lista_historial.size(); i++) {
                                                out.print("<tr>");
                                                out.print("<td>" + lista_historial.get(i).getIdreservainspeccion() +  "</td>");
                                                out.print("<td>" + lista_historial.get(i).getCalle()+ "</td>");
                                                out.print("<td>" + lista_historial.get(i).getNro_vivienda()+ "</td>");
                                                out.print("</tr>");
                                                
                                               
                                            }
                                      %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <br>
                    <br>
                </div>
                <div class="col-lg-3"><!--columnas grandes de 3-->
                    <br>
                    <br>
                    <br>
                </div>  
            </div>
        </div>>
    </section>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    
    </body>
</html>


