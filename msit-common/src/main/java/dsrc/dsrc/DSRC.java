/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.ASN1Module;
import com.oss.asn1.ASN1Type;

public abstract class DSRC extends ASN1Module {

    
    
    // Information object sets
    public static MESSAGE_ID_AND_TYPE_OSET messageTypes = 
	new MESSAGE_ID_AND_TYPE_OSET (
	    new MESSAGE_ID_AND_TYPE[] {
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(20),
		    new ASN1Type (
			"dsrc.dsrc",
			"BasicSafetyMessage"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(18),
		    new ASN1Type (
			"dsrc.dsrc",
			"MapData"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(19),
		    new ASN1Type (
			"dsrc.dsrc",
			"SPAT"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(21),
		    new ASN1Type (
			"dsrc.dsrc",
			"CommonSafetyRequest"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(22),
		    new ASN1Type (
			"dsrc.dsrc",
			"EmergencyVehicleAlert"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(23),
		    new ASN1Type (
			"dsrc.dsrc",
			"IntersectionCollision"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(24),
		    new ASN1Type (
			"dsrc.dsrc",
			"NMEAcorrections"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(25),
		    new ASN1Type (
			"dsrc.dsrc",
			"ProbeDataManagement"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(26),
		    new ASN1Type (
			"dsrc.dsrc",
			"ProbeVehicleData"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(27),
		    new ASN1Type (
			"dsrc.dsrc",
			"RoadSideAlert"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(28),
		    new ASN1Type (
			"dsrc.dsrc",
			"RTCMcorrections"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(29),
		    new ASN1Type (
			"dsrc.dsrc",
			"SignalRequestMessage"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(30),
		    new ASN1Type (
			"dsrc.dsrc",
			"SignalStatusMessage"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(31),
		    new ASN1Type (
			"dsrc.dsrc",
			"TravelerInformation"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(32),
		    new ASN1Type (
			"dsrc.dsrc",
			"PersonalSafetyMessage"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(240),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage00"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(241),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage01"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(242),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage02"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(243),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage03"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(244),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage04"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(245),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage05"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(246),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage06"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(247),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage07"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(248),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage08"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(249),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage09"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(250),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage10"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(251),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage11"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(252),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage12"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(253),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage13"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(254),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage14"
		    )
		),
		new MESSAGE_ID_AND_TYPE (
		    new DSRCmsgID(255),
		    new ASN1Type (
			"dsrc.dsrc",
			"TestMessage15"
		    )
		)
	    },
	    1,
	    "DSRC",
	    "MessageTypes"
	);
    public static PARTII_EXT_ID_AND_TYPE_OSET bSMpartIIExtension = 
	new PARTII_EXT_ID_AND_TYPE_OSET (
	    new PARTII_EXT_ID_AND_TYPE[] {
		new PARTII_EXT_ID_AND_TYPE (
		    new PartII_Id(0),
		    new ASN1Type (
			"dsrc.dsrc",
			"VehicleSafetyExtensions"
		    )
		),
		new PARTII_EXT_ID_AND_TYPE (
		    new PartII_Id(1),
		    new ASN1Type (
			"dsrc.dsrc",
			"SpecialVehicleExtensions"
		    )
		),
		new PARTII_EXT_ID_AND_TYPE (
		    new PartII_Id(2),
		    new ASN1Type (
			"dsrc.dsrc",
			"SupplementalVehicleExtensions"
		    )
		)
	    },
	    1,
	    "DSRC",
	    "BSMpartIIExtension"
	);
    
    // Value references
    public static final PartII_Id vehicleSafetyExt = 
	new PartII_Id(0);
    public static final PartII_Id specialVehicleExt = 
	new PartII_Id(1);
    public static final PartII_Id supplementalVehicleExt = 
	new PartII_Id(2);
    public static final BasicVehicleClass unknownVehicleClass = 
	new BasicVehicleClass(0);
    public static final BasicVehicleClass specialVehicleClass = 
	new BasicVehicleClass(1);
    public static final BasicVehicleClass passenger_Vehicle_TypeUnknown = 
	new BasicVehicleClass(10);
    public static final BasicVehicleClass passenger_Vehicle_TypeOther = 
	new BasicVehicleClass(11);
    public static final BasicVehicleClass lightTruck_Vehicle_TypeUnknown = 
	new BasicVehicleClass(20);
    public static final BasicVehicleClass lightTruck_Vehicle_TypeOther = 
	new BasicVehicleClass(21);
    public static final BasicVehicleClass truck_Vehicle_TypeUnknown = 
	new BasicVehicleClass(25);
    public static final BasicVehicleClass truck_Vehicle_TypeOther = 
	new BasicVehicleClass(26);
    public static final BasicVehicleClass truck_axleCnt2 = 
	new BasicVehicleClass(27);
    public static final BasicVehicleClass truck_axleCnt3 = 
	new BasicVehicleClass(28);
    public static final BasicVehicleClass truck_axleCnt4 = 
	new BasicVehicleClass(29);
    public static final BasicVehicleClass truck_axleCnt4Trailer = 
	new BasicVehicleClass(30);
    public static final BasicVehicleClass truck_axleCnt5Trailer = 
	new BasicVehicleClass(31);
    public static final BasicVehicleClass truck_axleCnt6Trailer = 
	new BasicVehicleClass(32);
    public static final BasicVehicleClass truck_axleCnt5MultiTrailer = 
	new BasicVehicleClass(33);
    public static final BasicVehicleClass truck_axleCnt6MultiTrailer = 
	new BasicVehicleClass(34);
    public static final BasicVehicleClass truck_axleCnt7MultiTrailer = 
	new BasicVehicleClass(35);
    public static final BasicVehicleClass motorcycle_TypeUnknown = 
	new BasicVehicleClass(40);
    public static final BasicVehicleClass motorcycle_TypeOther = 
	new BasicVehicleClass(41);
    public static final BasicVehicleClass motorcycle_Cruiser_Standard = 
	new BasicVehicleClass(42);
    public static final BasicVehicleClass motorcycle_SportUnclad = 
	new BasicVehicleClass(43);
    public static final BasicVehicleClass motorcycle_SportTouring = 
	new BasicVehicleClass(44);
    public static final BasicVehicleClass motorcycle_SuperSport = 
	new BasicVehicleClass(45);
    public static final BasicVehicleClass motorcycle_Touring = 
	new BasicVehicleClass(46);
    public static final BasicVehicleClass motorcycle_Trike = 
	new BasicVehicleClass(47);
    public static final BasicVehicleClass motorcycle_wPassengers = 
	new BasicVehicleClass(48);
    public static final BasicVehicleClass transit_TypeUnknown = 
	new BasicVehicleClass(50);
    public static final BasicVehicleClass transit_TypeOther = 
	new BasicVehicleClass(51);
    public static final BasicVehicleClass transit_BRT = 
	new BasicVehicleClass(52);
    public static final BasicVehicleClass transit_ExpressBus = 
	new BasicVehicleClass(53);
    public static final BasicVehicleClass transit_LocalBus = 
	new BasicVehicleClass(54);
    public static final BasicVehicleClass transit_SchoolBus = 
	new BasicVehicleClass(55);
    public static final BasicVehicleClass transit_FixedGuideway = 
	new BasicVehicleClass(56);
    public static final BasicVehicleClass transit_Paratransit = 
	new BasicVehicleClass(57);
    public static final BasicVehicleClass transit_Paratransit_Ambulance = 
	new BasicVehicleClass(58);
    public static final BasicVehicleClass emergency_TypeUnknown = 
	new BasicVehicleClass(60);
    public static final BasicVehicleClass emergency_TypeOther = 
	new BasicVehicleClass(61);
    public static final BasicVehicleClass emergency_Fire_Light_Vehicle = 
	new BasicVehicleClass(62);
    public static final BasicVehicleClass emergency_Fire_Heavy_Vehicle = 
	new BasicVehicleClass(63);
    public static final BasicVehicleClass emergency_Fire_Paramedic_Vehicle = 
	new BasicVehicleClass(64);
    public static final BasicVehicleClass emergency_Fire_Ambulance_Vehicle = 
	new BasicVehicleClass(65);
    public static final BasicVehicleClass emergency_Police_Light_Vehicle = 
	new BasicVehicleClass(66);
    public static final BasicVehicleClass emergency_Police_Heavy_Vehicle = 
	new BasicVehicleClass(67);
    public static final BasicVehicleClass emergency_Other_Responder = 
	new BasicVehicleClass(68);
    public static final BasicVehicleClass emergency_Other_Ambulance = 
	new BasicVehicleClass(69);
    public static final BasicVehicleClass otherTraveler_TypeUnknown = 
	new BasicVehicleClass(80);
    public static final BasicVehicleClass otherTraveler_TypeOther = 
	new BasicVehicleClass(81);
    public static final BasicVehicleClass otherTraveler_Pedestrian = 
	new BasicVehicleClass(82);
    public static final BasicVehicleClass otherTraveler_Visually_Disabled = 
	new BasicVehicleClass(83);
    public static final BasicVehicleClass otherTraveler_Physically_Disabled = 
	new BasicVehicleClass(84);
    public static final BasicVehicleClass otherTraveler_Bicycle = 
	new BasicVehicleClass(85);
    public static final BasicVehicleClass otherTraveler_Vulnerable_Roadworker = 
	new BasicVehicleClass(86);
    public static final BasicVehicleClass infrastructure_TypeUnknown = 
	new BasicVehicleClass(90);
    public static final BasicVehicleClass infrastructure_Fixed = 
	new BasicVehicleClass(91);
    public static final BasicVehicleClass infrastructure_Movable = 
	new BasicVehicleClass(92);
    public static final BasicVehicleClass equipped_CargoTrailer = 
	new BasicVehicleClass(93);
    public static final DSRCmsgID reservedMessageId_D = 
	new DSRCmsgID(0);
    public static final DSRCmsgID alaCarteMessage_D = 
	new DSRCmsgID(1);
    public static final DSRCmsgID basicSafetyMessage_D = 
	new DSRCmsgID(2);
    public static final DSRCmsgID basicSafetyMessageVerbose_D = 
	new DSRCmsgID(3);
    public static final DSRCmsgID commonSafetyRequest_D = 
	new DSRCmsgID(4);
    public static final DSRCmsgID emergencyVehicleAlert_D = 
	new DSRCmsgID(5);
    public static final DSRCmsgID intersectionCollision_D = 
	new DSRCmsgID(6);
    public static final DSRCmsgID mapData_D = 
	new DSRCmsgID(7);
    public static final DSRCmsgID nmeaCorrections_D = 
	new DSRCmsgID(8);
    public static final DSRCmsgID probeDataManagement_D = 
	new DSRCmsgID(9);
    public static final DSRCmsgID probeVehicleData_D = 
	new DSRCmsgID(10);
    public static final DSRCmsgID roadSideAlert_D = 
	new DSRCmsgID(11);
    public static final DSRCmsgID rtcmCorrections_D = 
	new DSRCmsgID(12);
    public static final DSRCmsgID signalPhaseAndTimingMessage_D = 
	new DSRCmsgID(13);
    public static final DSRCmsgID signalRequestMessage_D = 
	new DSRCmsgID(14);
    public static final DSRCmsgID signalStatusMessage_D = 
	new DSRCmsgID(15);
    public static final DSRCmsgID travelerInformation_D = 
	new DSRCmsgID(16);
    public static final DSRCmsgID uperFrame_D = 
	new DSRCmsgID(17);
    public static final DSRCmsgID mapData = 
	new DSRCmsgID(18);
    public static final DSRCmsgID signalPhaseAndTimingMessage = 
	new DSRCmsgID(19);
    public static final DSRCmsgID basicSafetyMessage = 
	new DSRCmsgID(20);
    public static final DSRCmsgID commonSafetyRequest = 
	new DSRCmsgID(21);
    public static final DSRCmsgID emergencyVehicleAlert = 
	new DSRCmsgID(22);
    public static final DSRCmsgID intersectionCollision = 
	new DSRCmsgID(23);
    public static final DSRCmsgID nmeaCorrections = 
	new DSRCmsgID(24);
    public static final DSRCmsgID probeDataManagement = 
	new DSRCmsgID(25);
    public static final DSRCmsgID probeVehicleData = 
	new DSRCmsgID(26);
    public static final DSRCmsgID roadSideAlert = 
	new DSRCmsgID(27);
    public static final DSRCmsgID rtcmCorrections = 
	new DSRCmsgID(28);
    public static final DSRCmsgID signalRequestMessage = 
	new DSRCmsgID(29);
    public static final DSRCmsgID signalStatusMessage = 
	new DSRCmsgID(30);
    public static final DSRCmsgID travelerInformation = 
	new DSRCmsgID(31);
    public static final DSRCmsgID personalSafetyMessage = 
	new DSRCmsgID(32);
    public static final DSRCmsgID testMessage00 = 
	new DSRCmsgID(240);
    public static final DSRCmsgID testMessage01 = 
	new DSRCmsgID(241);
    public static final DSRCmsgID testMessage02 = 
	new DSRCmsgID(242);
    public static final DSRCmsgID testMessage03 = 
	new DSRCmsgID(243);
    public static final DSRCmsgID testMessage04 = 
	new DSRCmsgID(244);
    public static final DSRCmsgID testMessage05 = 
	new DSRCmsgID(245);
    public static final DSRCmsgID testMessage06 = 
	new DSRCmsgID(246);
    public static final DSRCmsgID testMessage07 = 
	new DSRCmsgID(247);
    public static final DSRCmsgID testMessage08 = 
	new DSRCmsgID(248);
    public static final DSRCmsgID testMessage09 = 
	new DSRCmsgID(249);
    public static final DSRCmsgID testMessage10 = 
	new DSRCmsgID(250);
    public static final DSRCmsgID testMessage11 = 
	new DSRCmsgID(251);
    public static final DSRCmsgID testMessage12 = 
	new DSRCmsgID(252);
    public static final DSRCmsgID testMessage13 = 
	new DSRCmsgID(253);
    public static final DSRCmsgID testMessage14 = 
	new DSRCmsgID(254);
    public static final DSRCmsgID testMessage15 = 
	new DSRCmsgID(255);
    public static final FuelType unknownFuel = 
	new FuelType(0);
    public static final FuelType gasoline = 
	new FuelType(1);
    public static final FuelType ethanol = 
	new FuelType(2);
    public static final FuelType diesel = 
	new FuelType(3);
    public static final FuelType electric = 
	new FuelType(4);
    public static final FuelType hybrid = 
	new FuelType(5);
    public static final FuelType hydrogen = 
	new FuelType(6);
    public static final FuelType natGasLiquid = 
	new FuelType(7);
    public static final FuelType natGasComp = 
	new FuelType(8);
    public static final FuelType propane = 
	new FuelType(9);
    public static final RegionId noRegion = 
	new RegionId(0);
    public static final RegionId addGrpA = 
	new RegionId(1);
    public static final RegionId addGrpB = 
	new RegionId(2);
    public static final RegionId addGrpC = 
	new RegionId(3);
    public static final RegionId addGrpD = 
	new RegionId(4);
}
