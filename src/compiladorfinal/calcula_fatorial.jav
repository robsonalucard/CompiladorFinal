program calculaFatorial{

	int:  numero;

	func int fatorial (int: fat){
		if (fat > 1){
			return (fat * fatorial(fat - 1));
 		} else {
			return (1);
 		}
	}
	
	block{
		print("Digite um numero: ");
		read(numero);
		print("fatorial: ", fatorial(numero));
	}
}
