.class public Lmirror/android/location/LocationManager$GnssStatusListenerTransportO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmirror/android/location/LocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GnssStatusListenerTransportO"
.end annotation


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static onSvStatusChanged:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            I,
            [I,
            [F,
            [F,
            [F,
            [F
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/location/LocationManager$GnssStatusListenerTransportO;

    const-string v1, "android.location.LocationManager$GnssStatusListenerTransport"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/location/LocationManager$GnssStatusListenerTransportO;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
