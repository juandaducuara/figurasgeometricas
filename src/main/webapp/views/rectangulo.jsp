<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rectángulo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <LINK REL=StyleSheet HREF="styles.css" TYPE="text/css" MEDIA=screen>    
</head>
<body>
    <div class="container-fluid p-3 bg-success text-white text-center">
        <h1>¡Rectángulo!</h1>
        <p>Acontinuacion podras ingresar los datos para poder hallar el arear del la figura que elegistee</p> 
    </div>
    <div class="container mt-5">
        <div class="row">
          <div class="col-sm-6">
            <img src="https://cdn-icons-png.flaticon.com/512/5853/5853969.png" class="img-fluid" alt="Rectangulo">
        </div>
          <div class="col-sm-6">
                <form action="/action_page.php">
                    <h1>Digita los datos para hallar el area o el perimetro</h1>
                    <div class="mb-3 mt-3">
                        <label for="base" class="form-label">Base:</label>
                        <input type="base" class="form-control" id="base" placeholder="Digite base del triangulo" name="base">
                    </div>
                    <div class="mb-3">
                        <label for="altura" class="form-label">Altura:</label>
                        <input type="altura" class="form-control" id="altura" placeholder="Digite la altura del triangulo" name="altura">
                    </div>

                    <div class="btn-group">
                        <button type="submit" class="btn btn-primary">Hallar area</button>
                        <button type="submit" class="btn btn-dark">Hallar perimetro</button>
                        <button type="submit" class="btn btn-danger">Limpiar</button>
                    </div>
                </form>
                
        </div>
      </div>
      <a href="javascript:history.back()" class="btn-flotante">Volver al inicio</a>
    
</body>
</html>