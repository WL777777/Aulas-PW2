<?php include("estrutura/cabecalho.php"); ?>

<section>
    <h1> Contato </h1>
</section>

<section class="centro">
    <form action= "dados-contato.php" method="post">
        <div>
            <div> <label> Nome </label> </div>
            <input type="text" class="tx" name="txNome" placeholder="Digite seu nome aqui" />
            </label>
        </div>

        <div>
            <div><label> Gênero </label> </div>
            <input type="radio" name="rGenero" value= "Masculino" /> Masculino
            <input type="radio" name="rGenero"  value= "Feminino"/> Feminino
        </div>

        <div>
            <div><label> E-mail </label> </div>
            <input type="email" class="tx"  name="txEmail" placeholder="Digite seu e-mail" />
        </div>

        <div>
            <div><label> Assunto </label> </div>
            <input type="text" class="tx" name= "txAssunto" placeholder="Digite o assunto" />
        </div>

        <div>
            <div><label> Mensagem </label> </div>
            <textarea name="txMsg" ></textarea>
        </div>

        <div>
            <input type="submit" class="bt" value="Enviar" />
        </div>

    </form>

</section>

<?php include("estrutura/rodape.php"); ?>