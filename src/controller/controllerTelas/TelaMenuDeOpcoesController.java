package controller.controllerTelas;

import model.Principal;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.Usuariojdbc;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

public class TelaMenuDeOpcoesController implements Initializable {

    @FXML
<<<<<<< HEAD
    public void botaoAlterarSenha() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaAlterarSenha.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
=======
    public void botaoMinhaConta() {

    }

    @FXML
    public void AtualizarSenha(String senhaAtual) {

        if (!senhaAtual.equals(Usuariojdbc.usuarioLogado.getSenha())) {
            System.out.println("Senha incorreta");
        }
        Usuariojdbc u = new Usuariojdbc();
        u.updateUsuario(Usuariojdbc.usuarioLogado.getIdUsuario(), senhaAtual);
>>>>>>> b63d894a64a9bbab4ab1f20c642a3e6d7f461c5a
    }

    @FXML
    public void botaoFavoritos() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaFavoritos.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoVoltar() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaMenu.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoSair() {
        try {
            Usuariojdbc.usuarioLogado = null;
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}