<?php

$nota = array();

$nota [0] = 8;
$nota [1] = 2;
$nota[2] = 9;
$nota[3] = 1;

$tamanho = count($nota);

$media = 0;
for($i = 0; $i < $tamanho; $i++){
    $media = $media + $nota[$i];    
}
$media = $media / 4;
echo "Laço de repetição \"for\" Média: $media";

$media = 0;
$j = 0;
while ($j < $tamanho){
    $media = $media + $nota[$j];
    $j++;
}
$media = $media / 4;

echo "<br> Laço de repetição \"while\" Média: $media";

$media = 0;
$k = 0;
do {
    $media = $media + $nota[$k];
    $k++;
}
while($k < $tamanho);
$media = $media / 4;

echo "<br> Laço de repetição \"do while\" Média: $media";

?>
