package Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;


public class Funcao_DAO {
    
    public static Font f = new Font (FontFamily.HELVETICA,18,Font.BOLD);
   
    public static void Atestado()throws Exception {
        
        Document doc = null;
        OutputStream os = null;
    String x = JOptionPane.showInputDialog(null, "Digite o seu nome");
    String y = JOptionPane.showInputDialog(null, "Digite o seu RG");
    String a = JOptionPane.showInputDialog(null, "Digite uma data");
    String b = JOptionPane.showInputDialog(null, "Digite outra data");
    String m = JOptionPane.showInputDialog(null, "Digite um motivo");
    
  try {
 
            LocalDate data = java.time.LocalDate.now();
            String recebe = data.format(DateTimeFormatter.ISO_DATE);
      
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
 
            //cria a stream de saída
            os = new FileOutputStream("Relatorio1.pdf");
 
            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);
 
            //abre o documento
            doc.open();
 
            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("ATESTADO MÉDICO", f);
            par.setAlignment(Element.ALIGN_CENTER);
            doc.add(par);
            Paragraph par1 = new Paragraph("Atesto para devidos fins que o Sr.(a) "+ x +"\n"
                    + "portador da carteira de indetidade nº:"+ y +"\nesteve dob cuidados médicos no dia:"+ recebe+ " \n"
                    + "e deverá se afastar de suas atividades pelo periodo de:"+ a +" até "+ b +" por motivos de " + m);
            doc.add(par1);
            par1.setAlignment(Element.ALIGN_CENTER);
            Paragraph par4 = new Paragraph("Local: São Paulo   Data: "+ recebe);
            doc.add(par4);
            Paragraph par7 = new Paragraph("\n\n");
            doc.add(par7);
            Paragraph par5 = new Paragraph("______________________________");
            doc.add(par5);
            Paragraph par6 = new Paragraph("CARIMBO E ASSINATURA");
            doc.add(par6);
 
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Relatorio1.pdf"));
    }
    
    public static void Receituario()throws Exception {
        
        Document doc = null;
        OutputStream os = null;
    String x = JOptionPane.showInputDialog(null, "Digite o seu nome");
    String y = JOptionPane.showInputDialog(null, "Digite o seu CRM");
    String p = JOptionPane.showInputDialog(null, "Digite o nome do Paciente");
     
  try {
 
            LocalDate data = java.time.LocalDate.now();
            String recebe = data.format(DateTimeFormatter.ISO_DATE);
      
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
 
            //cria a stream de saída
            os = new FileOutputStream("Relatorio1.pdf");
 
            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);
 
            //abre o documento
            doc.open();
 
            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("Nome: " + x);
            doc.add(par);
            Paragraph par1 = new Paragraph("CRM: " + y);
            doc.add(par1);
            Paragraph par2 = new Paragraph("RECEITUÁRIO", f);
            doc.add(par2);
            Paragraph par3 = new Paragraph("Paciente: " + p);
            doc.add(par3);
            Paragraph par7 = new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            doc.add(par7);
            Paragraph par4 = new Paragraph("Local: São Paulo   Data: "+ recebe);
            doc.add(par4);
            Paragraph par5 = new Paragraph("______________________________");
            doc.add(par5);
            Paragraph par6 = new Paragraph("ASSINATURA");
            doc.add(par6);
 
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Relatorio1.pdf"));
    }
    public static void Declaracao()throws Exception {
        
        Document doc = null;
        OutputStream os = null;
    String x = JOptionPane.showInputDialog(null, "Digite o seu nome");
    String y = JOptionPane.showInputDialog(null, "Digite o seu CRM");
    String p = JOptionPane.showInputDialog(null, "Digite o nome do Paciente");
     
  try {
 
            LocalDate data = java.time.LocalDate.now();
            String recebe = data.format(DateTimeFormatter.ISO_DATE);
      
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
 
            //cria a stream de saída
            os = new FileOutputStream("Relatorio1.pdf");
 
            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);
 
            //abre o documento
            doc.open();
 
            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("Nome: " + x);
            doc.add(par);
            Paragraph par1 = new Paragraph("CRM: " + y);
            doc.add(par1);
            Paragraph par2 = new Paragraph("RECEITUÁRIO", f);
            doc.add(par2);
            Paragraph par3 = new Paragraph("Paciente: " + p);
            doc.add(par3);
            Paragraph par7 = new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            doc.add(par7);
            Paragraph par4 = new Paragraph("Local: São Paulo   Data: "+ recebe);
            doc.add(par4);
            Paragraph par5 = new Paragraph("______________________________");
            doc.add(par5);
            Paragraph par6 = new Paragraph("ASSINATURA");
            doc.add(par6);
 
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Relatorio1.pdf"));
    }
    
}

    