.class public Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/utils/ComponentUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IntentSenderInfo"
.end annotation


# instance fields
.field public base:Landroid/os/Bundle;

.field public callerActivity:Landroid/os/IBinder;

.field public fillIn:Landroid/os/Bundle;

.field public intent:Landroid/content/Intent;

.field public options:Landroid/os/Bundle;

.field public originalType:Ljava/lang/String;

.field public targetPkg:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public userId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
