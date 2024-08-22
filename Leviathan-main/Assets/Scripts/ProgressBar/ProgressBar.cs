using UnityEngine;
using UnityEngine.UI;

public class ProgressBar : MonoBehaviour
{
    public Image progressBar;
    public QuestionManager script;
    private float float1;
    
    void Start()
    {
        progressBar = GetComponent<Image>();

            // ReSharper disable once PossibleLossOfFraction
            progressBar.fillAmount = script.Factions[0].point / 100f;
    }
    
    public void ProgressBarF()
    {
        if (progressBar.fillAmount < 1)
        {
            // ReSharper disable once PossibleLossOfFraction
            progressBar.fillAmount = script.Factions[0].point / 100f; 
        }
    }
}
