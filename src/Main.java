import javax.swing.*;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        try{
            Pessoa pessoa = new Pessoa("111.111-01","joao");

        }catch (CpfInvalidException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private void escreverNoArquivo(String file, String mensagem) throws IOException {

        File file1 = new  File(file);
        file1.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        writer.write(mensagem);
        writer.newLine();
        writer.close();

    }

}
