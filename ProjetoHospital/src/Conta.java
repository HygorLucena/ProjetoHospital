
public class Conta {
		
		private int numero;
		private String dono;
		private double saldo;
		private double limite;	
			
			public Conta () {
				
			}
			
			public Conta ( String dono, double saldo ) {
				this.dono = dono;
				this.saldo = saldo;
			}
			
			
			public int getNumero() {
				return this.numero;
			}
			
			public void setNumero ( int valor ) {
				this.numero = valor;
			}
			
			public String getDono() {
				return this.dono;
			}
			
			public void setDono ( String nome ) {
				this.dono = nome;
			}
			
			public double getSaldo () {
				return this.saldo;
			}
			
			public void setSaldo ( double valor ) {
				this.saldo = valor;
			}
			
			public double getLimite () {
				return this.limite;
			}
			
			public void setLimite ( double valor ) {
				this.limite = valor;
			}
			
		
			void depositar ( double valor ) {
				this.saldo += valor;
			}
			
			boolean sacar ( double valor ) {
				
				if ( valor > 0 && this.saldo >= valor) {
					this.saldo = this.saldo - valor;
						System.out.println("Saldo Disponível.");
							return true;
				}else {
					System.out.println("Saldo Indisponível");
						return false;
				}		
			}
			
			
			void depositar (double valor, double percentual) {
				
					double bonus = (percentual / 100) * valor;
					this.saldo += ( valor + bonus);			 
			}
						
			boolean transferir ( double valor, Conta destino ) {
				
				while (true) {
					
					if ( valor > 0 ) {
						boolean retirar = this.sacar(valor);
						if ( retirar == false) {
							return false;
						}else {
							destino.depositar(valor);
							return true;
						}	
						
						
					}
					
				}
				
			}	

}
