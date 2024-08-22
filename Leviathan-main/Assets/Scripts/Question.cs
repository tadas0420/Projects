using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "Question", menuName = "ScriptableObjects/Questions", order = 1)]
public class Question : ScriptableObject
{
    public string question;
    public string answer1;
    public string answer2;
    public string consequence_1;
    public string consequence_2;
    public int[] effects_1 = new int[4];
    public int[] effects_2 = new int[4];
    public int nextQuestion_1;
    public int nextQuestion_2;
    public Sprite character;
}
