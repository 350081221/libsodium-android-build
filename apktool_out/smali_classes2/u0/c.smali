.class public Lu0/c;
.super Ls0/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls0/e;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    const-string v0, "cashier"

    .line 2
    .line 3
    const-string v1, "gentid"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls0/e;->g(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const-string v0, "5.0.0"

    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
