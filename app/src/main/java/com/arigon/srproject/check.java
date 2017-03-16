package com.arigon.srproject;

import android.widget.Button;
import android.widget.TextView;

import static com.arigon.srproject.TwoPlayerVar2.lsize;
import static com.arigon.srproject.TwoPlayerVar2.wsize;

/**
 * Created by art on 3/15/2017.
 */

public class check {
    ///////////////////////////////////////////////////////////////////
    //checkIfValid checks if it is ok to place a number in a given spot
    //return true if its ok to place the number
    //return false if not
    ///////////////////////////////////////////////////////////////////
    public Boolean checkIfValid(Button button, TextView alert, Button[] boardButtons, String value)
    {
        for(int i = 0; i<lsize*wsize; i++)
        {
            if(boardButtons[i] == button)//if button is in the array
            {
                //check if it is ok to place a number on slots 1 and 9
                if(boardButtons[i]==boardButtons[0]||boardButtons[i]==boardButtons[8])
                {
                    if(boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;

                            }

                        }
                    }
                    else if(boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+7].getText()=="<"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;

                            }

                        }

                    }
                    else if(boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }
                //check if it is ok to place a number on the rest of first and second row
                else if(boardButtons[i]==boardButtons[2]||boardButtons[i]==boardButtons[4]||boardButtons[i]==boardButtons[10])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }
                //check if it is ok to place a number on button 7 and 13
                else if(boardButtons[i]==boardButtons[6]||boardButtons[i]==boardButtons[12])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+7].getText()=="<"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }


                //check if it is ok to place a number on the two leftmost columns
                else if(boardButtons[i]==boardButtons[14]||boardButtons[i]==boardButtons[28]||boardButtons[i]==boardButtons[22])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))>Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //check if it is ok to place a number on the two rightmost columns
                else if(boardButtons[i]==boardButtons[20]||boardButtons[i]==boardButtons[26]||boardButtons[i]==boardButtons[34])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) >  Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }
                //check if it is ok to place a number on slots 37 and 43 bottom left  corner buttons
                else if(boardButtons[i]==boardButtons[42]||boardButtons[i]==boardButtons[36])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //check if it is ok to place a number on slots 41 and 49 bottom right corner
                else if(boardButtons[i]==boardButtons[40]||boardButtons[i]==boardButtons[48])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i-14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i-14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i-14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i-14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //check if it is ok to place a number on the rest of last two rows
                else if(boardButtons[i]==boardButtons[38]||boardButtons[i]==boardButtons[44]||boardButtons[i]==boardButtons[46])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //check if it is ok to place a number on the inner buttons
                else if(boardButtons[i]==boardButtons[16]||boardButtons[i]==boardButtons[18]||boardButtons[i]==boardButtons[24]||boardButtons[i]==boardButtons[30]||boardButtons[i]==boardButtons[32])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }


                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))<Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) >Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) <Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    { ///todo:inner buttons that are surrounded by 4 numbers(this is done)
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<"&&boardButtons[i+1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }

                    }

                }

            }
        }
        return false;

    }
}
