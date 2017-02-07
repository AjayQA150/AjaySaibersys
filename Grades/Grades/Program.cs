using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Grades
{
    class Program
    {
        public static int add(int a, int b) { return a + b; }
        static void Main(string[] args)
        {
            Gradebook book=new Gradebook();
            book.NameChanged = new NameChangedDelegate(OnNameChanged);
            book.Name = "SCOTT'S BOOK";

            book.AddGrade(91);
            book.AddGrade(89.5f);
            book.AddGrade(75);
            GradeStatistics stats=book.ComputeStatistics();
            book.Name = "Ajy's Book";
            book.NameChanged += OnNameChanged;
            book.NameChanged +=onNameChanged2;



            Console.WriteLine(book.Name);
            writeResult("Average", stats.AverageGrade);
            // Console.WriteLine(stats.AverageGrade);
            Console.WriteLine(stats.LowestGrade);
            //Console.WriteLine(stats.HighestGrade);
            writeResult("highest grade",stats.HighestGrade);
        }

        private static void onNameChanged2(object sender, NameChangedEventArgs args)
        {
            Console.WriteLine("*****");
        }

        private static void OnNameChanged(object sender, NameChangedEventArgs args)
        {
            Console.WriteLine("Name changed from {0} to {1}" args.OldValue,args.NewValue);
        }

        static void writeResult(string description, int result)
        {
            Console.WriteLine(description + ":" + result);
        }
        static void writeResult(string description,float result)
        {
            // Console.WriteLine(  description +":"+result);
            //writeline method using placeholders and format it as Float
             //Console.WriteLine("{0}:{1:F2}",description,result);
            //Writeline method using placeholders and format it as currency
           // Console.WriteLine("{0}:{1:C}", description, result);
            //a new C#6 feature for placeholders
            Console.WriteLine($"{description}:{result:C}");


        }
        /*
        static void OnNameChanged(string existingName,string newName)
        {
            Console.WriteLine($"Grade book Changing from {existingName} to {newName} ");
        }
        static void onNameChanged2(string existingName,string newName)
        {
            Console.WriteLine("********");
        }*/

    }
}
