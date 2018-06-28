program teste{

	int:  numero, i, j, fat;
     boolean: resu;
     float: b;
     string: nome;
     const int z = 5;

	func int fatorial (int: fat){
		if (fat > 1){
			return (fat * fatorial(fat - 1));
 		} else {
			return (1);
 		}
	}
	
	block{
		print("Digite um numero: ");
		read(i);
		print("fatorial: ", fatorial(i));
	}
}




















