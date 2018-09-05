package br.com.unialfa.aula.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculadoraController {
	
	@FXML
	private TextField txta;
	
	@FXML
	private TextField txtb;
	
	@FXML
	private Label lblresultado;
	
	@FXML
	private Label lblTela; 
	
	@FXML
	private Button btnsomar;
	
	@FXML
	private Button btnsubtrair;
	
	@FXML
	private Button btnmultiplicar;
	
	@FXML
	private Button btndividir;
	
	@FXML
	private Button btn0;
	
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	
	@FXML
	private Button btn3;
	
	@FXML
	private Button btn4;
	
	@FXML
	private Button btn5;
	
	@FXML
	private Button btn6;
	
	@FXML
	private Button btn7;
	
	@FXML
	private Button btn8;
	
	@FXML
	private Button btn9;
	
	@FXML
	private Button btnigual;
	
	@FXML
	private Button btnc;
	
	
	String valor1;
	String valor2, aux, split;
	int operacao = 0;
	double resultado;
	
	public void clear() {
		valor1 = "";
		valor2 = "";
		txta.setText("");
		operacao = 0; 
		lblresultado.setText("");
	}
	
	public void numero9() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 9;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 9;
				txta.setText(valor2);
			//	calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero8() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 8;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 8;
				txta.setText(valor2);
			//	calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero7() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 7;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 7;
				txta.setText(valor2);
			//	calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero6() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 6;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 6;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero5() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 5;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 5;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero4() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 4;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 4;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero3() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 3;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 3;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero2() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 2;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 2;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
	}
	
	public void numero1() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 1;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 1;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) {
								String vetor[] = valor2.split("\\/");
								double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
								resultado = Double.valueOf(valor1) / aux2;
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
				
			}
	}
	
	public void numero0() {
		if(operacao == 0){
			valor1 = txta.getText();
			valor1 += 0;
			resultado = Double.valueOf(valor1);
			txta.setText(valor1);
			lblresultado.setText(valor1);
			}else {
				valor2 = txta.getText();
				valor2 += 0;
				txta.setText(valor2);
				//calcular(operacao, valor1, valor2, resultado);
				if(operacao == 1) {
					String vetor[] = valor2.split("\\+");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = Double.valueOf(valor1) + aux2;
					lblresultado.setText(String.valueOf(resultado));
				}else {
					if(operacao == 2) {
						String vetor[] = valor2.split("\\-");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = Double.valueOf(valor1) - aux2;
						lblresultado.setText(String.valueOf(resultado));
					}else {
						if(operacao == 3) {
							String vetor[] = valor2.split("\\*");
							double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
							resultado = Double.valueOf(valor1) * aux2;
							lblresultado.setText(String.valueOf(resultado));
						}else {
							if(operacao == 4) { 
								valor1 = "Erro";
								lblresultado.setText(String.valueOf(resultado));
							}
						}
					}
				}
			}
		//lblresultado.setText(valor1);
	}
	
	public void somar() {
		operacao = 1;
		aux = txta.getText();
		aux += "+";
		txta.setText(aux);
		valor1 = String.valueOf(resultado);

	//	String txtValorA = txta.getText();
		//String txtValorB = txtb.getText();
		
	//	Double A = Double.valueOf(txtValorA);
		//Double B = Double.valueOf(txtValorB);
		
	//	lblresultado.setText(String.valueOf(A + B));
	}
	
	public void subtrair() {
		
		operacao = 2;
		aux = txta.getText();
		aux += "-";
		txta.setText(aux);
		valor1 = String.valueOf(resultado); 
//		String txtValorA = txta.getText();
//		String txtValorB = txtb.getText();
//		
//		Double A = Double.valueOf(txtValorA);
//		Double B = Double.valueOf(txtValorB);
//		
//		lblresultado.setText(String.valueOf(A - B));
	}
	
	
	public void multiplicar() {
		
		operacao = 3;
		aux = txta.getText();
		aux += "*";
		txta.setText(aux);
		valor1 = String.valueOf(resultado); 
//		String txtValorA = txta.getText();
//		String txtValorB = txtb.getText();
//		
//		Double A = Double.valueOf(txtValorA);
//		Double B = Double.valueOf(txtValorB);
//		
//		lblresultado.setText(String.valueOf(A * B));
	}
	
	public void dividir() {
		
		operacao = 4;
		aux = txta.getText();
		aux += "/";
		txta.setText(aux);
		valor1 = String.valueOf(resultado); 
//		String txtValorA = txta.getText();
//		String txtValorB = txtb.getText();
//		
//		Double A = Double.valueOf(txtValorA);
//		Double B = Double.valueOf(txtValorB);
//		
//		lblresultado.setText(String.valueOf(A / B));
	}
	
	public void igual() {
			valor1 = String.valueOf(resultado);
			String aux = valor1;
			clear();
			lblresultado.setText(aux);
		
	}
	
	public void calcular(int operacao, String valor1, String valor2, double resultado) {
		if(operacao == 1) {
			String vetor[] = valor2.split("\\+");
			double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
			resultado = resultado + aux2;
			valor1 = String.valueOf(resultado); 
			lblresultado.setText(valor1);
			System.out.println("Somei");
		}else {
			if(operacao == 2) {
				String vetor[] = valor2.split("\\-");
				double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
				resultado = resultado - aux2;
				valor1 = String.valueOf(resultado); 
				lblresultado.setText(valor1);
				System.out.println("subtraí");
			}else {
				if(operacao == 3) {
					String vetor[] = valor2.split("\\*");
					double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
					resultado = resultado * aux2;
					valor1 = String.valueOf(resultado); 	
					lblresultado.setText(valor1);
					System.out.println("multipliquei");
				}else {
					if(operacao == 4) {
						String vetor[] = valor2.split("\\/");
						double aux2 = Double.valueOf(vetor[vetor.length - 1].trim());
						resultado = resultado / aux2;
						valor1 = String.valueOf(resultado); 
						lblresultado.setText(valor1);
						System.out.println("dividi");
					}
				}
			}
		}
	}
	
//	public void showSobre() throws IOException{
//		
//		Stage stage = new Stage();
//		AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("../view/FXMLSobre.fxml"));
//		Scene scene = new Scene(pane);	
//		stage.setScene(scene);
//		stage.initStyle(StageStyle.UTILITY);
//		stage.show();
//		
//	}
//	
//	

}
