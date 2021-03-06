package me.lolevsky.nasaplanetary.view.screens.main;

import java.util.List;

import javax.inject.Inject;

import dagger.internal.Preconditions;
import me.lolevsky.nasaplanetary.domain.entety.MainScreenEntity;
import me.lolevsky.nasaplanetary.domain.interactor.MainScreenInteractor;
import me.lolevsky.nasaplanetary.domain.tracking.ITracking;
import me.lolevsky.nasaplanetary.mapper.MainScreenModelDataMapper;
import me.lolevsky.nasaplanetary.model.MainScreenModule;
import me.lolevsky.nasaplanetary.view.presenter.BasePresenter;
import me.lolevsky.nasaplanetary.view.IView;

public class MainPresenter extends BasePresenter<IView, MainScreenModule, List<MainScreenEntity>> {
    @Inject
    public MainPresenter(MainScreenInteractor mainScreenInteractor,
                         MainScreenModelDataMapper mainScreenModelDataMapper,
                         ITracking tracking) {
        super(Preconditions.checkNotNull(mainScreenInteractor), Preconditions.checkNotNull(mainScreenModelDataMapper)
                , Preconditions.checkNotNull(tracking));

        tracking.LogEventScreen("MainScreen");
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void pagingAddNewData(MainScreenModule newModel) {

    }

    @Override public void onNewPageRequest(int lastItemIndex) {

    }
}
