using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritimos.Lista4
{
    internal static class Exercicio4
    {
        internal static void Executar()
        {
            double num, resultado;
            num = 0;
            int j = 0;

            Console.WriteLine("Tabuada até 10 do número: ");
            num = Convert.ToDouble(Console.ReadLine());
            if (num == 0)
            {
                Console.WriteLine("Programa encerrando...");
            }
            else
                if (num < 0)
            {
                Console.WriteLine("Informe um valor positivo");
                Console.WriteLine("Tabuada até 10 do número: ");
                num = Convert.ToDouble(Console.ReadLine());

            }
            while (num > 0)
            {


                j++;

                for (int i = 1; i <= 10; i++)
                {
                    resultado = i * num;
                    Console.WriteLine($" {i} X {num} = {resultado}");

                }
                Console.WriteLine("Insira o próximo número a calcular ou 0 para encerrar:");
                num = Convert.ToDouble(Console.ReadLine());
                if (num == 0)
                {
                    Console.WriteLine("Programa encerrando...");
                }
                else
                if (num < 0)
                {
                    Console.WriteLine("Informe um valor positivo");
                    Console.WriteLine("Tabuada até 10 do número: ");
                    num = Convert.ToDouble(Console.ReadLine());

                }
            }
        }
    }
}
