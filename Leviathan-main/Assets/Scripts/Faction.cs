using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "Faction", menuName = "ScriptableObjects/Faction", order = 1)]
public class Faction : ScriptableObject
{
    public new string name;
    public int point;
}
