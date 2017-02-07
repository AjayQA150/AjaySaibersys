using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Grades;
namespace GradeBookTests.Types

{
    
    [TestClass]
    public class ReferenceTypeTests {
        [TestMethod]
        public void usingaArrays()
        {
            float[] grades;
            grades = new float[3];
            Addgrades(grades);
            Assert.AreEqual(89.0f, grades[1]);
        }

        private void Addgrades(float[] grades)
        {
            grades[1] = 89.0f;
        }

        [TestMethod]
        public void StringtoUppercase()
        {
            string name = "scott";
            name=name.ToUpper();

            Assert.AreEqual("SCOTT", name);
        }
        [TestMethod]
        public void AdddaystoDateTime()
    {
            DateTime date = new DateTime(2015,1,1);
             date=date.AddDays(1);
            Assert.AreEqual(2, date.Day);
    }
        [TestMethod]
        public void ReferenceTypespassByValue()
        {
            Gradebook book1 = new Gradebook();
            Gradebook book2 = book1;
            GiveBookaName(book1);
            Assert.AreEqual("A Gradebook",book1.Name);

        }
        private void GiveBookaName(Gradebook book)
        {
            //book = new Gradebook();
            book.Name = "A Gradebook";
        }
        [TestMethod]
        public void Stringcomparisions()
        {
            string name1 = "Scott";
            string name2= "scott";
            bool result = string.Equals(name1, name2,StringComparison.InvariantCultureIgnoreCase);
            Assert.IsTrue(result);

        }
        [TestMethod]
        public void IntVariablesHoldValue()
        {
            int x1 = 100;
            int x2 = x1;
             x1 = 4;
            Assert.AreNotEqual(x1, x2);
        }
        [TestMethod]
        public void VariablesHoldAReference()
        {
            Gradebook g1 = new Gradebook();
            Gradebook g2 = g1;
            //g1 = new Gradebook();
            g1.Name = "Scott's Grade Book";
            Assert.AreEqual(g1.Name, g2.Name);

        }
    }
}
