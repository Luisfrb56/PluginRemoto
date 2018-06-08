package org.luis.pluginremoto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

@ActionID(
        category = "File",
        id = "org.luis.pluginremoto.PluginRemotoCOD"
)
@ActionRegistration(
        iconBase = "org/luis/pluginremoto/github.png",
        displayName = "#CTL_PluginRemotoCOD"
)
@ActionReference(path = "Menu/Versioning", position = 0)
@Messages("CTL_PluginRemotoCOD=PluginRemoto")
public final class PluginRemotoCOD implements ActionListener {
//Aqui es donde vamos a mandar el repositorio remoto
    @Override
    public void actionPerformed(ActionEvent e) {
        //Primero pedimos un nombre para el repositorio que despues vamos a usar.
        String user=JOptionPane.showInputDialog("Nombre del usuario: ");
        String password=JOptionPane.showInputDialog("Contraseña: ");
        String repo=JOptionPane.showInputDialog("Nombre del repositorio");
        try{
            //Conectamos con github atraves .connect
            GitHub github=GitHub.connectUsingPassword(user, password);
            //Creamos el repositorio
            GHCreateRepositoryBuilder builder;
            //Insertamos el nombre que deseamos
            builder=github.createRepository(repo);
            //Fin de la creacion.
            builder.create();
        }catch(IOException ex){
            //Si da algun error al subirlo o con el usuario saltara esta excepcion.
            System.out.println("Error:"+ex);
        }
    }
}
