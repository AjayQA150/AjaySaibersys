﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Grades
{
    public class Gradebook
    {
        public Gradebook()
        {
            _name = "empty";
            grades = new List<float>();
        }
        public GradeStatistics ComputeStatistics()
        {
            GradeStatistics stats=new GradeStatistics();
            float  sum = 0;
            foreach(float grade in grades)
            {
                stats.HighestGrade = Math.Max(grade, stats.HighestGrade);
                stats.LowestGrade = Math.Min(grade, stats.LowestGrade);
                sum+= grade;
            }
            stats.AverageGrade = sum / grades.Count;
            return stats;
        }
        public void AddGrade(float grade)
        {
            grades.Add(grade);
        }
        public string Name {
            get
            {
                return _name.ToLower();
            }
            set
            {
                if (!String.IsNullOrEmpty(value))
                {
                    if (_name != value)
                    {
                        NameChangedEventArgs args = new NameChangedEventArgs();
                        args.OldValue = oldValue;
                        args.OldValue = value;
                        NameChanged(this, args);
                    }
                    _name = value;
                }
            }
        }
        public event NameChangedDelegate NameChanged;
        private string _name;

         List<float> grades;

        
    }
}
