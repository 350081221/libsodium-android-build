.class public abstract Lcom/lody/virtual/server/memory/MemoryValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/memory/MemoryValue$INT8;,
        Lcom/lody/virtual/server/memory/MemoryValue$INT4;,
        Lcom/lody/virtual/server/memory/MemoryValue$INT2;,
        Lcom/lody/virtual/server/memory/MemoryValue$ValueType;
    }
.end annotation


# static fields
.field private static final BYTE_ORDER:Ljava/nio/ByteOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    sput-object v0, Lcom/lody/virtual/server/memory/MemoryValue;->BYTE_ORDER:Ljava/nio/ByteOrder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/nio/ByteOrder;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/memory/MemoryValue;->BYTE_ORDER:Ljava/nio/ByteOrder;

    return-object v0
.end method


# virtual methods
.method public abstract toBytes()[B
.end method
