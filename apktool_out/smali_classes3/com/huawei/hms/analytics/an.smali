.class public final Lcom/huawei/hms/analytics/an;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ghi:[Ljava/lang/String;

.field private static final hij:[Ljava/lang/String;

.field private static final ijk:[Ljava/lang/String;

.field public static final ikl:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final klm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final lmn:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 33

    const-string v0, "$HA_NOTIFICATION_DISPLAY"

    const-string v1, "$DisplayNotification"

    const-string v2, "$HA_NOTIFICATION_CLICK"

    const-string v3, "$ClickNotification"

    const-string v4, "$HA_NOTIFICATION_CLEAR"

    const-string v5, "$ClearNotification"

    const-string v6, "$HA_APP_INSTALL"

    const-string v7, "$InstallApp"

    const-string v8, "$HA_APP_START"

    const-string v9, "$LaunchApp"

    const-string v10, "$HA_APP_UPDATE"

    const-string v11, "$UpdateApp"

    const-string v12, "$HA_FIRST_OPEN"

    const-string v13, "$AppFirstOpen"

    const-string v14, "$CustomReferrer"

    const-string v15, "$HA_SCREEN_ENTER"

    const-string v16, "$EnterScreen"

    const-string v17, "$HA_SCREEN_EXIT"

    const-string v18, "$ExitScreen"

    const-string v19, "$HA_CLEAR_DATA"

    const-string v20, "$ClearData"

    const-string v21, "$HA_CLEAR_CACHE"

    const-string v22, "$ClearCache"

    const-string v23, "$HA_APP_UNINSTALL"

    const-string v24, "$UninstallApp"

    const-string v25, "$InAppPurchase"

    const-string v26, "$RequestAd"

    const-string v27, "$DisplayAd"

    const-string v28, "$ClickAd"

    const-string v29, "$ObtainAdAward"

    const-string v30, "$StopAnalyticsCollection"

    const-string v31, "$CampaignPushClick"

    const-string v32, "$AppPushToken"

    filled-new-array/range {v0 .. v32}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/an;->ijk:[Ljava/lang/String;

    const-string v1, "$OpenAppFromAppLinking"

    const-string v2, "$UpdateFromAppLinking"

    const-string v3, "$ReOpenAppFromAppLinking"

    const-string v4, "$DisplayAppMessaging"

    const-string v5, "$DismissInAppMessage"

    const-string v6, "$ClickInAppMessage"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/huawei/hms/analytics/an;->hij:[Ljava/lang/String;

    const-string v2, "USERAGENT"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/huawei/hms/analytics/an;->ghi:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/an;->lmn:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/an;->klm:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/an;->ikl:Ljava/util/List;

    return-void
.end method
