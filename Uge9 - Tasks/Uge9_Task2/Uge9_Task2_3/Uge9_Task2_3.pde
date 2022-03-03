boolean jobsDone = true;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

boolean isJobDone()
//changed function from Void to Boolean
{
    return jobsDone;    
}
