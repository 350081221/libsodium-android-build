.class final Lcom/lody/virtual/client/VClient$ReceiverData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/VClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ReceiverData"
.end annotation


# instance fields
.field component:Landroid/content/ComponentName;

.field intent:Landroid/content/Intent;

.field pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

.field processName:Ljava/lang/String;

.field stacktrace:Ljava/lang/Throwable;


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
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient$ReceiverData;-><init>()V

    return-void
.end method
