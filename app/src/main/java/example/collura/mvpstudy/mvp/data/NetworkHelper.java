package example.collura.mvpstudy.mvp.data;

import example.collura.mvpstudy.mvp.mainactivity.MainActivityModel;
import example.collura.mvpstudy.mvp.secondactivity.SecondActivityModel;

/**
 * Created by Betto on 26/03/2018.
 */

interface NetworkHelper extends
        MainActivityModel.Network
        ,SecondActivityModel.Network{}
