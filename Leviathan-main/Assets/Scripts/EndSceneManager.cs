using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;



public class EndSceneManager : MonoBehaviour
{
    
    public List<TMPro.TextMeshProUGUI> TextView;
    public QuestionManager script;
    //public List<string> end_list;
    public int i = 0;

    // Start is called before the first frame update
    void Start()
    {
        foreach (var j in script.end_array)
        {
            TextView[i].text = j;
            i++;
        }
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
