.class public interface abstract Lcom/huawei/agconnect/apms/log/AgentLog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEBUG:I = 0x3

.field public static final ERROR:I = 0x6

.field public static final INFO:I = 0x4

.field public static final TAG:Ljava/lang/String; = "com.huawei.agc.apms"

.field public static final WARN:I = 0x5


# virtual methods
.method public abstract debug(Ljava/lang/String;)V
.end method

.method public abstract error(Ljava/lang/String;)V
.end method

.method public abstract error(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract getLevel()I
.end method

.method public abstract info(Ljava/lang/String;)V
.end method

.method public abstract setLevel(I)V
.end method

.method public abstract warn(Ljava/lang/String;)V
.end method
