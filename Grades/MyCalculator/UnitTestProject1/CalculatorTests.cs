using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MyCalculator;

namespace UnitTestProject1
{
    [TestClass]
    public class CalculatorTests
    {
        [TestMethod]
        [TestCategory("Add")]
        [Priority(0)]
        public void AddSimple()
        {
            var calculator = new Calculator();
            int sum=calculator.add(1,2);
            Assert.AreEqual(3, sum);
        }
        [TestMethod]
        [TestCategory("Divide")]
        [Priority(1)]
       // [Ignore]
        public void DivideSimple()
        {
            var calculator = new Calculator();
            int quetient = calculator.divide(10, 5);
            Assert.AreEqual(2, quetient);
        }
        [TestMethod]
        [TestCategory("Divide")]
        [ExpectedException(typeof(DivideByZeroException))]
        [Priority(1)]
        public void DividebyZero()
        {
            var calculator = new Calculator();
             calculator.divide(10, 0);
           
        }


    }
}
