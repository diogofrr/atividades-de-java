
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class AtividadeJava extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtividadeJava frame = new AtividadeJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AtividadeJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton altura = new JButton("Questao 1");
		altura.setForeground(new Color(255, 255, 255));
		altura.setBackground(new Color(0, 0, 255));
		altura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		altura.setBounds(216, 38, 115, 28);
		contentPane.add(altura);

		JButton media = new JButton("Questao 2");
		media.setForeground(new Color(255, 255, 255));
		media.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		media.setBackground(new Color(0, 0, 255));
		media.setBounds(216, 77, 115, 28);
		contentPane.add(media);

		JButton retangulo = new JButton("Questao 3");
		retangulo.setForeground(new Color(255, 255, 255));
		retangulo.setBackground(new Color(0, 0, 255));
		retangulo.setBounds(216, 116, 115, 28);
		contentPane.add(retangulo);

		JButton vra = new JButton("Questao 4");
		vra.setForeground(new Color(255, 255, 255));
		vra.setBackground(new Color(0, 0, 255));
		vra.setBounds(216, 155, 115, 28);
		contentPane.add(vra);

		JButton cavalo = new JButton("Questao 5");
		cavalo.setForeground(new Color(255, 255, 255));
		cavalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cavalo.setBackground(new Color(0, 0, 255));
		cavalo.setBounds(216, 194, 115, 28);
		contentPane.add(cavalo);

		JButton temp = new JButton("Questao 6");
		temp.setForeground(new Color(255, 255, 255));
		temp.setBackground(new Color(0, 0, 255));
		temp.setBounds(216, 232, 115, 28);
		contentPane.add(temp);
		
		JButton sair = new JButton("Sair");
		sair.setBackground(new Color(0, 0, 255));
		sair.setForeground(new Color(255, 255, 255));
		sair.setBounds(216, 271, 115, 28);
		contentPane.add(sair);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("src/imagem/cruzeiroBackground.jpg"));
		lblNewLabel_1.setBounds(-76, 0, 616, 371);
		contentPane.add(lblNewLabel_1);

		altura.addActionListener(this::MenuEncaminhaAltura);
		media.addActionListener(this::MenuEncaminhaMedia);
		retangulo.addActionListener(this::MenuEncaminhaRetangulo);
		vra.addActionListener(this::MenuEncaminhaVra);
		cavalo.addActionListener(this::MenuEncaminhaCavalo);
		temp.addActionListener(this::MenuEncaminhaTemp);
		sair.addActionListener(this::MenuEncaminhaSair);
	}

	public void MenuEncaminhaAltura(ActionEvent actionEvent) {


		String valorPeso;
		String[] opcoes = new String[] { "M", "F" };
		String[] nome = new String[10];

		float maiorAltura = 0;
		int qtdMulheres = 0;
		int[] sexo = new int[10];

		float[] altura = new float[10];

		for (int i = 0; i < 10; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "Digite o nome da " + (i + 1) + "ª pessoa: ", "Cadastro",
					JOptionPane.QUESTION_MESSAGE);

			do {
				valorPeso = JOptionPane.showInputDialog(null, "Insira a altura da " + (i + 1) + "ª pessoa: ",
						"Cadastro", JOptionPane.QUESTION_MESSAGE);

				try {
					altura[i] = Float.parseFloat(valorPeso);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor inválido.");
				}
				if (altura[i] > maiorAltura)
					maiorAltura = altura[i];
			} while (true);

			sexo[i] = JOptionPane.showOptionDialog(null, "Insira o sexo: ", "Cadastro", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			if (sexo[i] == 1)
				qtdMulheres++;
		}

		JOptionPane.showMessageDialog(null, "Maior altura do grupo: " + maiorAltura, "Resultado",
				JOptionPane.QUESTION_MESSAGE);

	}

	public void MenuEncaminhaMedia(ActionEvent actionEvent) {

		 Double numFuncionarios, salario, somaSalario = 0.0;
	        do {
	            String numFuncionariosString = JOptionPane.showInputDialog("Digite a quantidade de funcionários: ");
	            numFuncionarios = Double.parseDouble(numFuncionariosString);
	            if (numFuncionariosString.isEmpty() ||  Double.parseDouble(numFuncionariosString) <= 0) {
	                JOptionPane.showMessageDialog(null, "Informe uma quantidade válida!");
	            }
	        } while (numFuncionarios < 0);

	        

	        for(int i = 1; i <= numFuncionarios; i++) {
	            do {
	                String salarioString = JOptionPane.showInputDialog("Informe o salário do funcionário " + i + ": ");
	                salario = Double.parseDouble(salarioString);
	                if (salarioString.isEmpty() ||  Double.parseDouble(salarioString) <= 0) {
	                    JOptionPane.showMessageDialog(null, "Informe um valor válido!");
	                }
	            } while (salario < 0);
	            
	            somaSalario += salario;

	        }
	        
	        double mediaSalarial = somaSalario / numFuncionarios;
	        JOptionPane.showMessageDialog(null,"A média salarial da empresa é: " + mediaSalarial);		
		
	}
	
	public void MenuEncaminhaRetangulo(ActionEvent actionEvent) {
		
		 double hp, lp, ha, la;

	        do {
	            String hpString = JOptionPane.showInputDialog("Informe a altura da parede: ");
	            if (hpString.isEmpty() || Double.parseDouble(hpString) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura da parede deve ser positiva. Digite novamente.");
	            } else {
	                hp = Double.parseDouble(hpString);
	                break;
	            }
	        } while (true);

	        do {
	            String lpString = JOptionPane.showInputDialog("Informe a largura da parede: ");
	            if (lpString.isEmpty() || Double.parseDouble(lpString) <= 0) {
	                JOptionPane.showMessageDialog(null, "A largura da parede deve ser positiva. Digite novamente.");
	            } else {
	                lp = Double.parseDouble(lpString);
	                break;
	            }
	        } while (true);

	        do {
	            String haString = JOptionPane.showInputDialog("Informe a altura do azulejo: ");
	            if (haString.isEmpty() || Double.parseDouble(haString) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura do azulejo deve ser positiva. Digite novamente.");
	            } else {
	                ha = Double.parseDouble(haString);
	                break;
	            }
	        } while (true);

	        do {
	            String laString = JOptionPane.showInputDialog("Informe a largura do azulejo: ");
	            if (laString.isEmpty() || Double.parseDouble(laString) <= 0) {
	                JOptionPane.showMessageDialog(null, "A largura do azulejo deve ser positiva. Digite novamente.");
	            } else {
	                la = Double.parseDouble(laString);
	                break;
	            }
	        } while (true);

	        double areaParede = hp * lp;
	        double areaAzulejo = ha * la;
	        int numAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

	        JOptionPane.showMessageDialog(null, "Serão necessários " + numAzulejos + " azulejos.");
		
	}
	
	public void MenuEncaminhaVra(ActionEvent actionEvent) {
		
		  double raio, altura, volume;
	        double PI = 3.14159;

	        
	        do {
	            String raioString = JOptionPane.showInputDialog("Informe o valor do raio:");
	            if (raioString.isEmpty() || Double.parseDouble(raioString) <= 0) {
	                JOptionPane.showMessageDialog(null, "O raio deve ser um número positivo. Digite novamente.");
	            } else {
	                raio = Double.parseDouble(raioString);
	                break;
	            }
	        } while (true);

	        
	        do {
	            String alturaStr = JOptionPane.showInputDialog("Informe o valor da altura:");
	            if (alturaStr.isEmpty() || Double.parseDouble(alturaStr) <= 0) {
	                JOptionPane.showMessageDialog(null, "A altura deve ser um número positivo. Digite novamente.");
	            } else {
	                altura = Double.parseDouble(alturaStr);
	                break;
	            }
	        } while (true);

	        
	        volume = PI * raio * raio * altura;

	        
	        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
		
	}
	
	public void MenuEncaminhaCavalo(ActionEvent actionEvent) {
		
double massa, altura, tempo, cavalos;
        
        do {
            String massaString = JOptionPane.showInputDialog("Informe a massa em kg:");
            if (massaString.isEmpty() || Double.parseDouble(massaString) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                massa = Double.parseDouble(massaString);
                break;
            }
        } while(true);

        do {
            String alturaString = JOptionPane.showInputDialog("Informe a altura em metros:");
            if (alturaString.isEmpty() || Double.parseDouble(alturaString) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                altura = Double.parseDouble(alturaString);
                break;
            }
        } while(true);

        do {
            String tempoString = JOptionPane.showInputDialog("Informe o tempo em segundos:");
            if (tempoString.isEmpty() || Double.parseDouble(tempoString) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                tempo = Double.parseDouble(tempoString);
                break;
            }
        } while(true);
        
        cavalos = (massa * altura / tempo) / 745.7;
        
        JOptionPane.showMessageDialog(null, "A quantidade de cavalos necessários é: " + cavalos);
		
	}
	
	public void MenuEncaminhaTemp(ActionEvent actionEvent) {
		
		 double celsius, kelvin, reaumur, rankine, fahrenheit;

	        do {
	            String celsiusString = JOptionPane.showInputDialog("Informe a temperatura em Celsius:");
	            if (celsiusString.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
	            } else {
	                try {
	                    celsius = Double.parseDouble(celsiusString);
	                    break;
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
	                }
	            }
	        } while(true);

	        fahrenheit = celsius * 1.8 + 32;
	        kelvin = celsius + 273.15;
	        reaumur = celsius * 0.8;
	        rankine = celsius * 1.8 + 32 + 459.67;

	        JOptionPane.showMessageDialog(null, 
	          "Fahrenheit: " + Math.round(fahrenheit) + "°F\n" 
	        + "Kelvin: "     + Math.round(kelvin) + " K\n"
	        + "Réaumur: "    + Math.round(reaumur) + "°Re\n"
	        + "Rankine: "    + Math.round(rankine) + "°Ra");
		
	}
	
	public void MenuEncaminhaSair(ActionEvent actionEvent) {
		System.exit(0);
	}
}
