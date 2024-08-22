using System;
using System.Collections;
using UnityEngine;
using UnityEngine.UI;
using System.Collections.Generic;
using UnityEngine.SceneManagement;
using Object = UnityEngine.Object;


public class QuestionManager : MonoBehaviour
{
        public TMPro.TextMeshProUGUI leftbutton;
        public TMPro.TextMeshProUGUI rightbutton;
        public TMPro.TextMeshProUGUI mainquestion;

        public List<Question> Questions;
        public List<Faction> Factions;
        private int i;

        public SpriteRenderer cr;
        public ProgressBar script;
        public List<String> end_array;
        private Faction _f;
        private float float1;
        
        public List<Image> progressBar;
        
    void Start()
    {
        i = 1;
        leftbutton.text = Questions[0].answer1;
        rightbutton.text = Questions[0].answer2;
        mainquestion.text = Questions[0].question;
        _f = new Faction();
        
        _f.name = "Lower Class";
        _f.point = 50;
        Factions.Add(_f);
        _f.name = "High Class";
        _f.point = 50;
        Factions.Add(_f);
        _f.name = "Church";
        _f.point = 50;
        Factions.Add(_f);
        _f.name = "Military";
        _f.point = 50;
        Factions.Add(_f);

        // ReSharper disable once PossibleLossOfFraction
        Debug.Log(Factions[0].point / 100f);

        //  GameObject.Find("Button").GetComponentInChildren<Text>().text = Questions[0].answer1;
        //GameObject.Find("Button2").GetComponentInChildren<Text>().text = Questions[0].answer2;
        //GameObject.Find("Text1").GetComponentInChildren<Text>().text = Questions[0].question;

        //Debug.Log((Questions[0].answer1));
        progressBar[0].fillAmount = Factions[0].point / 100f;
        progressBar[1].fillAmount = Factions[1].point / 100f;
        progressBar[2].fillAmount = Factions[2].point / 100f;
        progressBar[3].fillAmount = Factions[3].point / 100f;
    }
    
    public void ChangeQuestion()
    {         
        if (i < Questions.Count)
        {
            ProgressBarF();
            leftbutton.text = Questions[i].answer1;
            rightbutton.text = Questions[i].answer2;
            mainquestion.text = Questions[i].question;
            cr.sprite = Questions[i].character;
            i++;
        }
        else
        {
            Debug.Log("Game over");
            gameover();
        }
    }

    public void ApplyEffect1()
    {
        for (int j = 0; j < 4; j++)
        {
            Debug.Log(j);
            Debug.Log(Factions[j].name);
            Debug.Log(Questions[i - 1].effects_1[j]);
            Debug.Log(Factions[j].point += Questions[i - 1].effects_1[j]);
            //end_array.Add(Questions[j].consequence_1);
            if (Factions[j].point <= 0)
            {
                Debug.Log("Game over");
                gameover();
            }
        }
    }

    public void ApplyEffect2()
    {
        for (int j = 0; j < 4; j++)
        {
            Debug.Log(j);
            Debug.Log(Factions[j].name);
            Debug.Log(Questions[i - 1].effects_2[j]);
            Debug.Log(Factions[j].point += Questions[i - 1].effects_2[j]);
            //end_array.Add(Questions[j].consequence_2);
            if (Factions[j].point <= 0)
            {
                Debug.Log("Game over");
                gameover();
            }
        }
    }

    /*public void ProgressBarF()
    {
        if (progressBar.fillAmount < 1)
        {
            // ReSharper disable once PossibleLossOfFraction
            progressBar.fillAmount = Factions[0].point / 100f; 
        }
    }*/
    
    public void gameover()
    {
        SceneManager.LoadScene("EndScene");
    }        
    
    public void ProgressBarF()
    {
        // ReSharper disable once PossibleLossOfFraction
        progressBar[0].fillAmount = Factions[0].point / 100f;
        progressBar[1].fillAmount = Factions[1].point / 100f;
        progressBar[3].fillAmount = Factions[2].point / 100f;
        progressBar[3].fillAmount = Factions[3].point / 100f;
    }
    
}
