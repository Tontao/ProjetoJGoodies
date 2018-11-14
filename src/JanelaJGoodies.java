import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class JanelaJGoodies extends JFrame{
	
	system.out.print("ola");
	
	public JanelaJGoodies() {
		
		JTextField nomeField = new JTextField();x
		JComboBox estadoCivil = new JComboBox();
		JTextField cpfField = new JTextField();
		JComboBox etnia = new JComboBox();
		JTextField rgField = new JTextField();
		JRadioButton sexoM = new JRadioButton("M");
		JRadioButton sexoF = new JRadioButton("F");
		JTextField emailField = new JTextField();

		JRadioButton l;
		
		JComboBox curso = new JComboBox();
		JComboBox periodo = new JComboBox();
				
		JTextField ruaField = new JTextField();
		JComboBox cidade = new JComboBox();
		JTextField bairroField = new JTextField();
		JComboBox uf = new JComboBox();
		
		JTextField nomePaiField = new JTextField();
		JTextField nomeMaeField = new JTextField();
		JTextField nomeRespField = new JTextField();
		
		JTextField telCelField = new JTextField();
		JTextField telResField = new JTextField();

		
		FormLayout layout = new FormLayout(
				"30dlu, right:pref, 4dlu, 70dlu:grow, 3dlu, 60dlu:grow, 4dlu, pref, 4dlu, 70dlu:grow , 30dlu ",
				//	1,      2       3         4        5    6      7     8     9      10	     11	
				"20dlu, pref, 3dlu, pref, 3dlu, pref, 3dlu, pref, 4dlu, pref, 3dlu, pref, 4dlu, pref, 3dlu, pref, 3dlu, pref, 4dlu, pref, 3dlu, pref, 3dlu, pref, 3dlu, pref, 4dlu, pref, 20dlu");
				//  1    2      3    4     5     6     7     8      9    10     11    12   13    14     15   16    17    18    19     20   21     22   23    24    25    26    27    28 	29
		
		DefaultFormBuilder builder =  new DefaultFormBuilder(layout, new FormDebugPanel()); 
		
		CellConstraints cc = new CellConstraints();
		builder.addLabel("Nome:     ", cc.xy(2,2));			
		builder.add(nomeField, cc.xyw(4, 2, 3));		
		//3dlu
		builder.addLabel("Estado Civil:", cc.xy(8,2));
		builder.add(estadoCivil, cc.xy(10, 2 ));
		
		builder.addLabel("CPF:     ", cc.xy(2,4));			
		builder.add(cpfField, cc.xyw(4, 4, 3));			
		
		builder.addLabel("Etnia:", cc.xy(8,4));
		builder.add(etnia, cc.xy(10, 4));
		
		builder.addLabel("RG:     ", cc.xy(2,6));			
		builder.add(rgField, cc.xyw(4, 6, 3));			
		
		builder.addLabel("Sexo:", cc.xy(8,6));
		builder.add(sexoM, cc.xy(10, 6));
		builder.add(sexoF, cc.xy(11, 6));
		
		builder.addLabel("Email:    ", cc.xy(2,8));			
		builder.add(emailField, cc.xyw(4, 8, 3));
		
		
		builder.addLabel("Curso:    ", cc.xy(2,10));
		builder.add(curso, cc.xy(4, 10));
		
		builder.addLabel("Periodo:    ", cc.xy(2,12));
		builder.add(periodo, cc.xy(4, 12));
		
		
		builder.addSeparator("Endereco   ", cc.xyw(2,14,9));
		
		builder.addLabel("Rua:    	", cc.xy(2,16));		 	
		builder.add(ruaField, cc.xyw(4, 16, 3));		
		
		builder.addLabel("Cidade:", cc.xy(8,16));
		builder.add(cidade, cc.xy(10, 16));
		
		builder.addLabel("Bairro:     ", cc.xy(2,18)); 		
		builder.add(bairroField, cc.xyw(4, 18, 3));		
		
		builder.addLabel("UF:", cc.xy(8,18));
		builder.add(uf, cc.xy(10, 18));
		
		
		builder.addSeparator("Responsavel   ", cc.xyw(2,20,9));
		
		builder.addLabel("Nome do Pai:   ", cc.xy(2,22));			
		builder.add(nomePaiField, cc.xyw(4, 22, 3));
		
		builder.addLabel("Nome da Mae:   ", cc.xy(2,24));			
		builder.add(nomeMaeField, cc.xyw(4, 24, 3));
		
		builder.addLabel("Nome do Responsavel:", cc.xy(2,26));			
		builder.add(nomeRespField, cc.xyw(4, 26, 3));
		
		
		builder.addLabel("Tel-Celular:    ", cc.xy(2,28));
		builder.addLabel("Tel-Residencia:", cc.xy(8,28));			
		builder.add(telCelField, cc.xy(4, 28));
		builder.add(telResField, cc.xy(10, 28));
		
		
		this.getContentPane().add(builder.getPanel()); 
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaJGoodies jg = new JanelaJGoodies();
		jg.setTitle("Uso do JGoodies");
		jg.setBounds(400,100,800,600); // define x,y,tamx,tamy da tela
		jg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ex.setBackground(Color.WHITE);    // adiciona cor de fundo ao JPanel.
		jg.pack();  //forca o redezenho da janela segundo respeitando o JPanel do Frame
		jg.setVisible(true);
		
	}

}
