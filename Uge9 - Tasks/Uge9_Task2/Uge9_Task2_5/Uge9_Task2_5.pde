boolean jobsDone = true;

void setup()
{
    if (isJobDone())
    {
      //added missing ; after println function.
        println("Job's done!"); 
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
