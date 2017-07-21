(ns metabase.models.common)

(def ^:const timezones
  "The different timezones supported by Metabase.
   Presented as options for the `report-timezone` Setting in the admin panel."
  ["Africa/Algiers"
   "Africa/Cairo"
   "Africa/Casablanca"
   "Africa/Harare"
   "Africa/Nairobi"
   "Africa/Windhoek"
   "America/Bogota"
   "America/Buenos_Aires"
   "America/Caracas"
   "America/Costa_Rica"
   "America/Chihuahua"
   "America/Godthab"
   "America/Guatemala"
   "America/Manaus"
   "America/Mexico_City"
   "America/Montevideo"
   "America/Santiago"
   "America/Tijuana"
   "Asia/Amman"
   "Asia/Baghdad"
   "Asia/Baku"
   "Asia/Bangkok"
   "Asia/Beirut"
   "Asia/Calcutta"
   "Asia/Colombo"
   "Asia/Dhaka"
   "Asia/Hong_Kong"
   "Asia/Irkutsk"
   "Asia/Jerusalem"
   "Asia/Kabul"
   "Asia/Karachi"
   "Asia/Katmandu"
   "Asia/Krasnoyarsk"
   "Asia/Kuala_Lumpur"
   "Asia/Kuwait"
   "Asia/Magadan"
   "Asia/Muscat"
   "Asia/Novosibirsk"
   "Asia/Rangoon"
   "Asia/Seoul"
   "Asia/Taipei"
   "Asia/Tbilisi"
   "Asia/Tehran"
   "Asia/Tokyo"
   "Asia/Vladivostok"
   "Asia/Yakutsk"
   "Asia/Yekaterinburg"
   "Asia/Yerevan"
   "Atlantic/Azores"
   "Atlantic/Cape_Verde"
   "Atlantic/South_Georgia"
   "Australia/Adelaide"
   "Australia/Brisbane"
   "Australia/Darwin"
   "Australia/Hobart"
   "Australia/Perth"
   "Australia/Sydney"
   "Brazil/East"
   "Canada/Eastern"
   "Canada/Newfoundland"
   "Canada/Saskatchewan"
   "Europe/Athens"
   "Europe/Belgrade"
   "Europe/Berlin"
   "Europe/Brussels"
   "Europe/Helsinki"
   "Europe/London"
   "Europe/Minsk"
   "Europe/Moscow"
   "Europe/Warsaw"
   "Pacific/Auckland"
   "Pacific/Fiji"
   "Pacific/Guam"
   "Pacific/Midway"
   "Pacific/Tongatapu"
   "US/Alaska"
   "US/Arizona"
   "US/Central"
   "US/East-Indiana"
   "US/Eastern"
   "US/Hawaii"
   "US/Mountain"
   "US/Pacific"
   "GMT"
   "UTC"])