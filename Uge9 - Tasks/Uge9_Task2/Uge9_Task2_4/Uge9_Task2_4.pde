boolean jobsDone = true;

void setup()
{
  //added () for isJobsDone in the if-statement
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
