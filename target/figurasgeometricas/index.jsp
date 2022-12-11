<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Geometric</title>    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" src="style.css">
</head>
<body>
    <div class="container-fluid p-3 bg-dark text-white text-center">
        <h1>¡Geometric shapes!</h1>
        <p>Acontinuacion se mostraran una serie de figuras geometricas de la cuales les podras sacar el area y perimetro</p> 
    </div>
        
      <div class="container mt-5">
        <div class="row">
          <div class="col-sm-4">
            <img src="https://cdn-icons-png.flaticon.com/512/1200/1200864.png" class="img-fluid" alt="Pentagono">
            <h3>Pentágono</h3>
            <p>es una figura geométrica formada por cinco lados, además que tiene cinco vértices y cinco ángulos internos</p>
            <p>Dato curioso: Uniendo los vértices del pentágono, se obtiene un pentagrama (estrella de 5 puntas) inscrito en él. En el centro quedará otro pentágono regular, con lo que el proceso de inscribir pentagramas en los sucesivos pentágonos que se vayan generando, matemáticamente, no tiene fin.</p>
            <a href="views/pentagono.jsp">
              <button type="submit" class="btn btn-primary">¡Intentalo tu mismo!</button>
          </a>
          </div>
          <div class="col-sm-4">
            <img src="https://cdn-icons-png.flaticon.com/512/5853/5853969.png" class="img-fluid" alt="Rectangulo">
            <h3>Rectángulo</h3>
            <p>Un rectángulo es una figura geométrica plana de cuatro lados, de los cuales dos lados que son opuestos paralelos entre sí tienen la misma longitud y los dos restantes tienen otra longitud. </p>
            <p>Dato curioso: Cada rectángulo tiene un punto central. Si cortamos el rectángulo con una línea recta a través del centro, las dos piezas resultantes tendrán la misma área.</p>
            <a href="views/rectangulo.jsp">
              <button type="submit" class="btn btn-primary">¡Intentalo tu mismo!</button>
          </a>
          </div>
          <div class="col-sm-4">
            <img src="https://cdn-icons-png.flaticon.com/512/5886/5886874.png" class="img-fluid" alt="Decagono">
            <h3>Decágono</h3>        
            <p>Es aquel que tiene sus diez lados de igual longitud y todos los ángulos internos de la misma graduación.</p>
            <p>Dato curioso: La suma de todos los ángulos internos de cualquier decágono es 1440 grados.</p>
            <a href="views/decagono.jsp">
                <button type="submit" class="btn btn-primary">¡Intentalo tu mismo!</button>
            </a>             
          </div>
        </div>
      </div>
</body>
</html>