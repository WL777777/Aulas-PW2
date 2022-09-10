<!DOCTYPE html>
<html lang="PT-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabela</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="img/pais.css">
</head>
<body>
    <div class = "pai" >
    <?php 
    
    $paises= array();

    $paises[0]= "Brasil";
    $paises[1]= "Japão" ; 
    $paises[2]= "Inglaterra" ;
    $paises[3]= "Canadá" ;
    $paises[4]= "Egito" ;


    $continentes= array();

    $continentes[0]= "América do sul";
    $continentes[1]= "Ásia" ; 
    $continentes[2]= "Europa" ;
    $continentes[3]= "América do norte" ;
    $continentes[4]= "Africa" ;


    $imagens= array();

    $imagens[0]= "img/Br.png";
    $imagens[1]= "img/japao.png" ; 
    $imagens[2]= "img/inglaterra.png";
    $imagens[3]= "img/canada.png" ;
    $imagens[4]= "img/egito.png" ;

    for($i = 0; $i<count($paises); $i++){

    echo "<div class=\"filho\">";
    echo "<h1>$paises[$i]</h1>";
    echo "$continentes[$i]";
    echo "<br />";
    echo "<br />";
    echo "<img src = '$imagens[$i]' /> <br>"; 
    echo "<br />";
    echo "<a href='pais.php?x=$paises[$i]&y=$continentes[$i]&z=$imagens[$i]'> País </a> ";
    echo "<br /></div>";


    }

    ?>   
    
   
 </div>
</body>
</html>