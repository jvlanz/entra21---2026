function cadastrar() {

    var nome = document.getElementById("nome");

    var email = document.getElementById("email");

    var telefone = document.getElementById("telefone");

    var lista = document.getElementById("listaClientes");

    if (nome.value === "" || email.value === "" || telefone.value === "") {
        alert("Preencha todos os campos!");
        return;
    }
    let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

    // cria novo usuário
    const novoUsuario = {
        nome: nome.value,
        email: email.value,
        telefone: telefone.value
    };

    // adiciona na lista
    usuarios.push(novoUsuario);

    // salva de volta
    localStorage.setItem("usuarios", JSON.stringify(usuarios));

    window.location.href = "tabela.html";
}



/*tabela.innerHTML +=
"<tr>" +
"<td>" + nome.value + "</td>" +
"<td>" + email.value + "</td>" +
"<td>" + telefone.value + "</td>" +
"</tr>";*/

function mostrarTabela() {
    window.location.href = 'tabela.html'
}
function mostrarCadastro() {
    window.location.href = 'cadastro.html'
}
/*function carregarTabela() {
     const dadosf = JSON.parse(localStorage.getItem('dadosStr'));

        document.getElementById("tabela").innerHTML += `
            <tr>
                <td>${dadosf.nome}</td>
                <td>${dadosf.email}</td>
                <td>${dadosf.telefone}</td>
            </tr>
        `;
    
}*/
function carregarTabela() {

    const usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

    const tabela = document.getElementById("tabela");

    tabela.innerHTML = ""; // limpa antes

    usuarios.forEach(usuario => {
        tabela.innerHTML += `
            <tr>
                <td>${usuario.nome}</td>
                <td>${usuario.email}</td>
                <td>${usuario.telefone}</td>
            </tr>
        `;
    });
}
