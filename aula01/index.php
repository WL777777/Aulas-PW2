<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <h1> Olá mundo! </h1>

</body>
</html>


<?php

   echo "Olá Mundo!";

   echo "<h1> wffoiek </h1>";

   $idade = 19 . "<br  />";
   $nome2 = "Alexa". "<br  />";
   $peso = 90.43. "<br  />";
   $nome = "Wallace". "<br  />";

   echo $nome ;
   echo $idade ;
   echo $nome2;
   echo $peso; 
   echo "texto" . $nome;

   // para comentar no php, coloque barra barra. para concatenar, coloque .
   
   echo "texto $nome <br  />       ";

   echo " nome: $nome idade: $idade Peso: $peso <br  />";
   echo 'texto' . " $nome2";

   //operadores aritméticos +(soma)      -(subtração)          * (multiplicação)        /(divisão)                 %(resto da divisão)

  //entrada das variaveis.
   $n1= 2;
   $n2 = 5;

  //processamento 
   $soma = $n1 + $n2;
   $subtracao = $n1 - $n2;
   $multiplicacao = $n1 * $n2;
   $divisao = $n1 / $n2;

    //saida
   echo "<p> soma: $n1 + $n2  = $soma <br  /> <p> ";
   echo "<p> subtracao: $n1 - $n2 = $subtracao <br  /> <p> ";
   echo "<p> multiplicacao: $n1 * $n2 = $multiplicacao  <br  /> <p>  ";
   echo "<p>  divisao: $n1 / $n2 = $divisao <br  /><p>   ";

?>