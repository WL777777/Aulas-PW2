<!DOCTYPE html>
<html lang="en">
<head>
      <link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php

 $valor1 = 5;
 $valor2 = 10;
 $valor3 = 10;
 $valor4 = 9;

  $media = ($valor1 + $valor2 + $valor3 + $valor4)/4;
                  
   if($media > 6){ echo " <h1 class = 'aprovado'.> aprovado. </h1>" ;
               // se for maior 
               echo " <H2 class = Rec> sua média é: . $media </H2>";
   }
  else {  echo " <h1 class = 'reprovado'> reprovado.  </h1>";
              // se for menor  
              echo " <H2 class = Rec>sua média é: . $media </H2>";
  }





?>





</body>
</html>