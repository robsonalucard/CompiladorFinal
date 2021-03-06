
package Visao;

import compiladorfinal.CompiladorFinal;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;

public class TelaIDE extends javax.swing.JFrame {
    
    File fileFonte;
    File fileCompilado;
    String title;
    boolean alterado;
    RSyntaxTextArea jTextArea1;
    
    public TelaIDE() {
        
        JPanel cp = new JPanel(new BorderLayout());

        this.jTextArea1 = new RSyntaxTextArea(22, 87);
        
        /*AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/JavaSimplificado", "IDE.Sintaxe");*/
        jTextArea1.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        
        jTextArea1.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(jTextArea1);
        cp.add(sp);
        
        setContentPane(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(this);
        sp.setLocation(5, 42);
        
        initComponents();
       
        this.jTextArea1.setLineWrap(true);
        this.fileFonte = null;
        this.fileCompilado = null;
        this.alterado = false;
        this.title = "Novo Arquivo - IDE";
        this.setTitle(this.title);
        
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        
        //jTextArea1.setBackground(new java.awt.Color(47,79,79));
         
        this.jTextArea2.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonAbrir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jButtonCompilar = new javax.swing.JButton();
        jButtonExecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setBackground(new java.awt.Color(247, 231, 215));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(75, 66, 66));
        jTextArea2.setRows(5);
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jButtonAbrir.setText("Abrir");
        jButtonAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirMouseClicked(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });

        jButtonSobre.setText("Sobre");
        jButtonSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSobreMouseClicked(evt);
            }
        });

        jButtonCompilar.setText("Compilar");
        jButtonCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCompilarMouseClicked(evt);
            }
        });

        jButtonExecutar.setText("Executar");
        jButtonExecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExecutarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAbrir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                        .addComponent(jButtonSobre)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButtonCompilar)
                .addGap(27, 27, 27)
                .addComponent(jButtonExecutar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrir)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonSobre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCompilar)
                    .addComponent(jButtonExecutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSobreMouseClicked
        // TODO add your handling code here:
        new Sobre(this).setVisible(true);
    }//GEN-LAST:event_jButtonSobreMouseClicked

    private void jButtonAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter(){
            @Override
            public boolean accept(File f){
               return (f.getName().endsWith(".jav")) || f.isDirectory();
            }
            @Override
            public String getDescription(){
                return "*.jav";
            }
        });
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.fileCompilado = null; //reset no arquivo compilado.
            this.alterado = false;
            this.fileFonte = fileChooser.getSelectedFile();
            BufferedReader buffer;
            try {
                buffer = new BufferedReader(new FileReader(this.fileFonte));
                String linha = "", texto = "";
                while ((linha = buffer.readLine()) != null) {
                    texto += linha+"\n";
                }
                
                this.jTextArea1.setText(texto);
                this.title = this.fileFonte.getName()+" - IDE";
                this.setTitle(this.title);
                buffer.close();
            } catch (IOException ex) {
                this.jTextArea2.setText("Erro na abertura do arquivo!");
            }
        }
    }//GEN-LAST:event_jButtonAbrirMouseClicked

    public void preencherArquivo() throws IOException{
        PrintWriter writer = new PrintWriter(new FileWriter(this.fileFonte, false));
        writer.println(this.jTextArea1.getText());
        writer.close();
        this.title = this.fileFonte.getName()+" - IDE";
        this.setTitle(this.title);
        this.alterado = false;
    }
    
    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        // TODO add your handling code here:
            try {
                if(this.fileFonte == null){ //novo arquivo.
                    JFileChooser salvandoArquivo = new JFileChooser();
                    salvandoArquivo.setFileFilter(new javax.swing.filechooser.FileFilter(){
                        @Override
                        public boolean accept(File f){
                           return (f.getName().endsWith(".jav")) || f.isDirectory();
                        }
                        @Override
                        public String getDescription(){
                            return "*.jav";
                        }
                    });
                    int resultado = salvandoArquivo.showSaveDialog(this);
                    if (resultado != JFileChooser.APPROVE_OPTION) {
                        return;
                    }
                    this.fileFonte = salvandoArquivo.getSelectedFile();
                    if(this.fileFonte.exists()){ //arquivo ja existe
                        String[] options = {"Cancelar", "Sobrescrever"};
                        int op = JOptionPane.showOptionDialog(this, "O arquivo '"+this.fileFonte.getName()+"' já existe. Deseja sobrescrever?", 
                                            "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                        if(op == 1){ //sobrescrever 
                            preencherArquivo();
                            this.fileCompilado = null;
                        }else{
                            this.fileFonte = null;
                        }
                    }else{
                        this.fileFonte.createNewFile();
                        preencherArquivo();
                        this.fileCompilado = null;
                    }
                }else{ //arquivo atual
                    preencherArquivo();
                    this.fileCompilado = null;
                }
            } catch (IOException ex) {
                this.jTextArea2.setText("Erro ao salvar o arquivo!");
            }
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void jButtonCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCompilarMouseClicked
        // TODO add your handling code here:
        if(this.fileCompilado == null && this.fileFonte != null){ //arquivo nao compilado
            this.fileCompilado = new CompiladorFinal(this.fileFonte).compilar();
            BufferedReader buffer;
            try {
                buffer = new BufferedReader(new FileReader(this.fileFonte.getParent()+"/LOG"));
                String linha = "", texto = "";
                while ((linha = buffer.readLine()) != null) {
                    texto += linha+"\n";
                }
                if(texto.equals("")){
                    texto = "NENHUM ERRO ENCONTRADO DURANTE A COMPILAÇÃO!";
                    texto += "\nCódigo Jasmin gerado: "+this.fileCompilado.getAbsolutePath();
                    try {
                        Process exec;
                        String[] cmds = {"java", "-jar", "jasmin.jar", "-d", this.fileFonte.getParent(), this.fileCompilado.getAbsolutePath()};
                        exec = Runtime.getRuntime().exec(cmds);
                        //texto += "\n\njava -jar jasmin.jar -d "+ this.fileFonte.getParent()+" "+ this.fileCompilado.getAbsolutePath();
                        
                        if (exec.waitFor() == 0)
                            texto += "\nExecutável Java criado: "+this.fileCompilado.getParent()+"/"+
                                    this.getNomeExecutavel(this.fileCompilado.getName())+".class";
                        else
                            texto += "\nErro ao gerar .class";
                    } catch (InterruptedException ex) {
                        texto += "\nErro ao executar comando.";
                    }
                }
                this.jTextArea2.setText(texto);
            } catch (IOException ex) {
                this.jTextArea2.setText("Erro ao abrir arquivo de log.");
            }
        }else if(this.fileFonte == null || this.alterado){
            JOptionPane.showMessageDialog(this, "Arquivo não salvo!");
        }else{
            JOptionPane.showMessageDialog(this, "O Arquivo já está compilado!");
        }
    }//GEN-LAST:event_jButtonCompilarMouseClicked

    @SuppressWarnings("empty-statement")
    private void jButtonExecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExecutarMouseClicked
        // TODO add your handling code here:
        if(this.fileCompilado != null && !this.alterado){
            String nome = this.getNomeExecutavel(this.fileCompilado.getName());
            String saida = "";
            Process exec;  
            try {  
                String[] cmds2 = {"/usr/bin/x-terminal-emulator", "-e", "java -cp '"+this.fileFonte.getParent()+"' "+ nome};
                exec = Runtime.getRuntime().exec(cmds2);
                //saida += "/usr/bin/x-terminal-emulator --disable-factory -e java -cp '"+ this.fileFonte.getParent()+"' "+nome;
                if (exec.waitFor() == 0)  
                    saida += "Executando...";  
                else  
                    saida += "\nErro ao executar .class";
                
                this.jTextArea2.setText(saida);
                
            } catch (Exception e) {  
                e.printStackTrace();  
                this.jTextArea2.setText("Erro durante a execução!\nFuncionalidade disponível apenas para Linux.\n"
                        + "Tente executar o comando manualmente em um terminal:\n"+"java -cp '"+ this.fileFonte.getParent()+"' "+nome);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Salvar e compilar antes de executar!");
        }
    }//GEN-LAST:event_jButtonExecutarMouseClicked

    public String getNomeExecutavel(String nomeCompilado){
        return nomeCompilado.substring(0, nomeCompilado.length() - 2);
    }
    
    private void jTextArea2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        this.setTitle("*"+this.title);
        this.alterado = true;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaIDE nf = new TelaIDE();
                nf.setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonCompilar;
    private javax.swing.JButton jButtonExecutar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}