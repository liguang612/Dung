package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.modelHomepage;
import view.viewHomepage;

public class controllerHomepage {
    private modelHomepage mHomepage;
    private viewHomepage vHomepage;
    
    public controllerHomepage(viewHomepage vHomepage) {
        this.vHomepage = vHomepage;
        this.mHomepage = vHomepage.getModelHomepage();
    };

    public class homepageListener implements ActionListener, MouseListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == vHomepage.getQuestionSetup()) {
                vHomepage.popupQuestion();
            }
        }

        public void mouseClicked(MouseEvent me) {
            if (me.getSource() == vHomepage.getMainLogo()) {
                vHomepage.getEditPanel().setVisible(false);
                vHomepage.getBrowsePanel().setVisible(true);
            }
        };
        public void mouseEntered(MouseEvent me) {};
        public void mouseExited(MouseEvent me) {};
        public void mousePressed(MouseEvent me) {
            if (me.getSource() == vHomepage.getPuQues_questions()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(0);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_categories()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(1);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_import()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(2);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_export()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(3);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
        };
        public void mouseReleased(MouseEvent me) {};
    }
}
