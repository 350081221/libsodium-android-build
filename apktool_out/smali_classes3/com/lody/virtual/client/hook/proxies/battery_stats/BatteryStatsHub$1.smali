.class Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub$1;
.super Lcom/lody/virtual/client/hook/base/ReplaceLastUidMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub$1;->this$0:Lcom/lody/virtual/client/hook/proxies/battery_stats/BatteryStatsHub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/ReplaceLastUidMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method
