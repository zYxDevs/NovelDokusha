package my.noveldokusha.di

import android.content.Context
import androidx.work.WorkManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import my.noveldokusha.App
import my.noveldokusha.BuildConfig
import my.noveldokusha.core.AppInternalState
import my.noveldokusha.scraper.AppLocalSources
import my.noveldokusha.scraper.sources.LocalSource
import my.noveldokusha.core.Toasty
import my.noveldokusha.core.ToastyToast
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindToasty(toast: ToastyToast): Toasty

    @Binds
    @Singleton
    abstract fun bindAppLocalSources(v: AppLocalSources): LocalSource

    companion object {

        @Provides
        @Singleton
        fun providesApp(@ApplicationContext context: Context): App {
            return context as App
        }

        @Provides
        fun providesWorkManager(
            @ApplicationContext context: Context
        ): WorkManager {
            return WorkManager.getInstance(context)
        }

        @Provides
        @Singleton
        fun providesAppInternalState(): AppInternalState = object : AppInternalState {
            override val isDebugMode = BuildConfig.DEBUG
            override val versionCode = BuildConfig.VERSION_CODE
            override val versionName = BuildConfig.VERSION_NAME
        }
    }
}