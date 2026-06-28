.class final Lcom/lody/virtual/client/VClient$NewIntentData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/VClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NewIntentData"
.end annotation


# instance fields
.field creator:Ljava/lang/String;

.field intent:Landroid/content/Intent;

.field token:Landroid/os/IBinder;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/VClient$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient$NewIntentData;-><init>()V

    return-void
.end method
