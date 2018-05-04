/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.luis.pluginremoto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
