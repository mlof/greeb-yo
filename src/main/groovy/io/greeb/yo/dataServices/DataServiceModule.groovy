package io.greeb.yo.dataServices

import com.google.inject.AbstractModule
import io.greeb.yo.dataServices.rss.RSSService

class DataServiceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(RegionDataService)
    bind(BanWordDataService)
    bind(RSSService)
  }
}
