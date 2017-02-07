using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyCalculator
{
    public class Calculator
    {
        public int add(int first,int second)
        {
            return first + second;
        }
        public int divide(int dividend,int divisor)
        {
            return dividend/divisor;
        }
        public int test(int dividend, int divisor)
        {
            int result = 0;
            try
            {
                Calculator calcuator = new Calculator();
                result = calcuator.divide(dividend, divisor);
                
            }
            catch (DivideByZeroException)
            {
                result = int.MaxValue;
            }
            catch(Exception)
            {
                result = int.MinValue;
            }
            return result;
        }
    }
}
